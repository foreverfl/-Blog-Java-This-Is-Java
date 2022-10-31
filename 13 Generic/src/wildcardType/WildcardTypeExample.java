package wildcardType;

import java.util.Arrays;

public class WildcardTypeExample {
	// 수강생은 모든 타입이 가능하다.
	public static void registerCourse(Course<?> course) {
		System.out.println("[" + course.getName() + "] 수강생: " + Arrays.toString(course.getStudents()));
	}

	// 수강생은 Student와 HighStudent만 가능하다.
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println("[" + course.getName() + "] 수강생: " + Arrays.toString(course.getStudents()));
	}

	// 수강생은 Worker와 Person만 가능하다.
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println("[" + course.getName() + "] 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인 과정", 4);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Person("직장인"));
		personCourse.add(new Person("학생"));
		personCourse.add(new Person("고등학생"));

		Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 4);
		workerCourse.add(new Worker("직장인"));

		Course<Student> studentCourse = new Course<Student>("학생 과정", 4);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new Student("고등학생"));

		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생 과정", 4);
		highStudentCourse.add(new HighStudent("고등학생"));

		System.out.println("registerCourse");
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		System.out.println("registerCourseStudent");
//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();;
		
		System.out.println("registerCourseWorker");
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(highStudentCourse);
		System.out.println();

		
	}
}
