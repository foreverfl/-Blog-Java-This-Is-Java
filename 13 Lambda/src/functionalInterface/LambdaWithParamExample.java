package functionalInterface;

public class LambdaWithParamExample {
	public static void main(String args[]) {
		LambdaWithParam functionalInterface;

		functionalInterface = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		functionalInterface.method(2);

		functionalInterface = (x) -> {
			System.out.println(x * 5);
		};
		functionalInterface.method(2);

		// 매개 변수가 하나일 경우에는 괄호()를 생략할 수 있다.
		functionalInterface = x -> System.out.println(x * 5);
		functionalInterface.method(2);
	}
}
