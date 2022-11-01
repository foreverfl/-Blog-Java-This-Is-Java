package standardFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample {
	private static List<Student> list = Arrays.asList(new Student("모구모구", 95, 90), new Student("문재인", 60, 30));

	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for (Student student : list) {
			// 람다식 실행
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}

	public static void main(String[] args) {
		double engAvg = avg(s -> s.getEngScore());
		System.out.println("영어 평균 점수: " + engAvg);

		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
	}

}
