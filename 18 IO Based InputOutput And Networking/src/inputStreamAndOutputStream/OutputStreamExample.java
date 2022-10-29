package inputStreamAndOutputStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {

	public static void onputStreamWriteOne() throws IOException {
		OutputStream outputStream = System.out;
		byte[] data = "ABC".getBytes();
		for (int i = 0; i < data.length; i++) {
			outputStream.write(data[i]);
		}

		outputStream.flush();
		outputStream.close();
	}

	public static void onputStreamWriteSome() throws IOException {

	}

	public static void onputStreamWriteSomePartially() throws IOException {

	}

	public static void main(String[] arsgs) throws IOException {
		onputStreamWriteOne();

		System.out.println("=============");
	}
}
