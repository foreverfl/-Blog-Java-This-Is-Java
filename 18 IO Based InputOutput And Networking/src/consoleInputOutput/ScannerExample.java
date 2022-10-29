package consoleInputOutput;

import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("문자열을 입력해주세요.");
		String inputString = scanner.nextLine();
		System.out.println(inputString);

		System.out.println("정수를 입력해주세요.");
		int inputInt = scanner.nextInt();
		System.out.println(inputInt);

		System.out.println("실수를 입력해주세요.");
		double inputDouble = scanner.nextDouble();
		System.out.println(inputDouble);
		scanner.close();
	}
}
