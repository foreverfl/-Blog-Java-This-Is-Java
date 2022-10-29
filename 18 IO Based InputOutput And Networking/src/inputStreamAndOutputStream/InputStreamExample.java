package inputStreamAndOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
	public static void inputStreamReadOne() throws IOException {
		InputStream inputStream = new FileInputStream("C:/test/test.txt");

		int readByte;
		while ((readByte = inputStream.read()) != -1) {
			System.out.println(readByte);
		}

		inputStream.close();

	}

	public static void inputStreamReadSome() throws IOException {
		InputStream inputStream = new FileInputStream("C:/test/test.txt");

		int readByteCnt;
		byte[] readBytes = new byte[3];
		while ((readByteCnt = inputStream.read(readBytes)) != -1) {
			System.out.println(readByteCnt);
		}

		inputStream.close();
	}

	public static void inputStreamReadSomePartially() throws IOException {
		InputStream inputStream = new FileInputStream("C:/test/test.txt");

		int readByteArr;
		byte[] readBytes = new byte[10];
		while ((readByteArr = inputStream.read(readBytes, 0, 5)) != -1) {
			System.out.println(readByteArr);
		}

		inputStream.close();
	}

	public static void main(String[] args) throws IOException {
		inputStreamReadOne();

		System.out.println("=============");

		inputStreamReadSome();

		System.out.println("=============");

		inputStreamReadSomePartially();
		
		System.out.println("=============");
	}
}
