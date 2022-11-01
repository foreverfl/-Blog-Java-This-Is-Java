package functionalInterface;

public class LambdaWithReturnExample {
	public static void main(String[] args) {
		LambdaWithReturn functionalInterface;

		functionalInterface = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(functionalInterface.method(2, 5));

		functionalInterface = (x, y) -> {
			return x + y;
		};
		System.out.println(functionalInterface.method(2, 5));

		functionalInterface = (x, y) -> x + y;
		System.out.println(functionalInterface.method(2, 5));

		functionalInterface = (x, y) -> sum(x, y);
		System.out.println(functionalInterface.method(2, 5));
	}

	public static int sum(int x, int y) {
		return x + y;
	}
}
