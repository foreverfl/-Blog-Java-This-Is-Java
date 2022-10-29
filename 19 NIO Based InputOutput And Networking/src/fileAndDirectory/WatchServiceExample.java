package fileAndDirectory;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

public class WatchServiceExample {
	public static void main(String[] args) throws IOException, InterruptedException {
		WatchService watchService = FileSystems.getDefault().newWatchService();
		Path directory = Paths.get("C:/test");

		directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE,
				StandardWatchEventKinds.ENTRY_MODIFY);

		while (true) {
			// WatchKey가 큐에 들어올 때까지 블로킹
			WatchKey watchKey = watchService.take();
			// WatchEvent 목록 얻기
			List<WatchEvent<?>> list = watchKey.pollEvents();

			for (WatchEvent<?> watchEvent : list) {
				// 이벤트 종류 얻기
				Kind<?> kind = watchEvent.kind();
				// 감지된 Path 얻기
				Path path = (Path) watchEvent.context();
				if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
					System.out.println("생성되었습니다.");
					System.out.println(path.getFileName());
				} else if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
					System.out.println("삭제되었습니다.");
					System.out.println(path.getFileName());
				} else if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
					System.out.println("수정되었습니다.");
					System.out.println(path.getFileName());
				} else if (kind == StandardWatchEventKinds.OVERFLOW) {

				}

			}

			boolean valid = watchKey.reset();
			if (!valid)
				break;
		}
	}
}
