package fileAndDirectory;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemInformationExample {
	public static void main(String args[]) throws IOException {
		FileSystem fileSystem = FileSystems.getDefault();

		System.out.println("드라이버 정보");
		for (FileStore store : fileSystem.getFileStores()) {
			System.out.println("드라이버명: " + store.name());
			System.out.println("파일 시스템: " + store.type());
			System.out.println("전체 공간: " + byteToGigabyte(store.getTotalSpace()) + "GB");
			System.out
					.println("사용 중인 공간: " + byteToGigabyte(store.getTotalSpace() - store.getUnallocatedSpace()) + "GB");
			System.out.println("사용 가능한 공간: " + byteToGigabyte(store.getUsableSpace()) + "GB");
			System.out.println();
		}

		System.out.println("파일 구분자: " + fileSystem.getSeparator());
		System.out.println();

		for (Path path : fileSystem.getRootDirectories()) {
			System.out.println(path.toString());
		}
	}

	public static long byteToGigabyte(long byteSize) {
		long kiloByte = byteSize / 1024;
		long megaByte = kiloByte / 1024;
		long gigaByte = megaByte / 1024;
		return gigaByte;
	}
}
