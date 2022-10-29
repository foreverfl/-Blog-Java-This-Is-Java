package auxiliaryStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TextAuxiliaryStreamExample {
	public static void main(String args[]) throws IOException {
		Reader reader = new InputStreamReader(System.in);
		Writer writer = new OutputStreamWriter(System.out);

		String data = null;
		int readCharCnt;
		char[] charBuffer = new char[100];
		while ((readCharCnt = reader.read(charBuffer)) != -1) {
			data = new String(charBuffer, 0, readCharCnt);
			writer.write(data);

		}

		writer.flush();
		writer.close();
		reader.close();

	}
}
