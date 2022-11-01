package standardFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(new Student("문재인", "남자", 50, 50),
			new Student("홍준표", "남자", 100, 100), new Student("윤석열", "남자", 90, 80), new Student("윤미향", "여자", 50, 50),
			new Student("김정숙", "여자", 20, 20));

	private static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for (Student student : list) {
			if (predicate.test(student)) {
				count++;
				sum += student.getEngScore();
			}
		}
		return (double) sum / count;
	}

	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		System.out.println("남자 평균 영어 점수: " + maleAvg);

		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 영어 점수: " + femaleAvg);
	}

}
