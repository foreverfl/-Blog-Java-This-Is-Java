package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MakingOperationSubmit {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 5; i++) {
			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("총 스레드 개수: " + poolSize);
					System.out.println("작업 스레드 이름: " + threadName);

					// 예외 발생 시킴
					Integer.parseInt("일");

				}

			};

			executorService.submit(runnable);

			Thread.sleep(10);
		}

		executorService.shutdown();
	}
}
