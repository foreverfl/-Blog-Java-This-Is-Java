package fileAndDirectory;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class PathExample {
	public static void main(String[] args) {
		System.out.println("기본 경로 정보");
		Path absolutePath = Paths.get("C:/test/test.txt");
		System.out.println("파일명: " + absolutePath.getFileName());
		System.out.println("부모 디렉토리명: " + absolutePath.getParent().getFileName());
		System.out.println("중첩 경로수: " + absolutePath.getNameCount());
		System.out.println("");
		
		System.out.println("경로 순회하기");
		Iterator<Path> iterator = absolutePath.iterator();
		while (iterator.hasNext()) {
			Path tmp = iterator.next();
			System.out.println(tmp.getFileName());
		}

	}
}
