package standardFunctionalInterface;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String args[]) {
		IntSupplier intSupplier = () -> {
			// Math.random() 메소드는 0.0에서 1.0(1.0은 포함하지 않음) 사이의 수를 출력한다.
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};

		// getXXX() 메소드는 값을 리턴한다.
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수: " + num);
	}
}
