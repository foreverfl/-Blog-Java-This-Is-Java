package fileChannel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWriteAndReadExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/test/test.txt");

		// 디렉토리 를 생성한다. 이미 디렉토리가 존재해서 생성할 수 없더라도 예외를 던지지는 않는다.
		Files.createDirectories(path.getParent());

		Charset charset = Charset.defaultCharset();

		// 파일 쓰기
		// FileChannel 생성
		FileChannel fileChannel_create = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

		String data_create = "안녕하세요";

		ByteBuffer byteBuffer_create = charset.encode(data_create);

		// 데이터 쓰기
		int byteCount_create = fileChannel_create.write(byteBuffer_create);
		System.out.println("생성된 바이트버퍼" + byteCount_create);
		System.out.println("===================");

		// 파일 읽기
		// FileChannel 생성
		FileChannel fileChannel_read = FileChannel.open(path, StandardOpenOption.READ);

		ByteBuffer byteBuffer_read = ByteBuffer.allocate(100);

		String data_read = "";
		int byteCount_read;

		// 데이터 읽기
		while (true) {
			byteCount_read = fileChannel_read.read(byteBuffer_read);

			if (byteCount_read == -1)
				break;

			byteBuffer_read.flip();
			data_read += charset.decode(byteBuffer_read).toString();
			byteBuffer_read.clear();

		}

		System.out.println("읽힌 바이트버퍼" + data_read);

		fileChannel_create.close();
		fileChannel_read.close();

	}
}
