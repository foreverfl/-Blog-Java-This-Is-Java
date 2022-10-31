package functionalInterface;

public class LambdaWithoutParamAndReturnExample {
	public static void main(String args[]) {
		LambdaWithoutParamAndReturn functionalInterface;

		functionalInterface = () -> {
			String str = "method call1";
			System.out.println(str);
		};

		functionalInterface.method();

		functionalInterface = () -> {
			System.out.println("method call2");
		};

		functionalInterface.method();

		// 실행문이 하나라면 중괄호는 생략 가능하다.
		functionalInterface = () -> System.out.println("method call3");

		functionalInterface.method();
	}
}
