package standardFunctionalInterface;

import java.util.function.BinaryOperator;

public class MinByMaxByExample {
	public static void main(String[] args) {
		BinaryOperator<Student> binaryOperator;
		Student student;

		binaryOperator = BinaryOperator.minBy((o1, o2) -> Integer.compare(o1.getEngScore(), o2.getEngScore()));
		student = binaryOperator.apply(new Student("타로", 100), new Student("문재인", 50));
		System.out.println(student.getName());
		
		binaryOperator = BinaryOperator.maxBy((o1, o2) -> Integer.compare(o1.getEngScore(), o2.getEngScore()));
		student = binaryOperator.apply(new Student("타로", 100), new Student("문재인", 50));
		System.out.println(student.getName());
	}
}
