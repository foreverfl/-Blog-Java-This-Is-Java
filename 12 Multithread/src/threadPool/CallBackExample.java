package threadPool;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallBackExample {
	private ExecutorService executorService;

	public CallBackExample() {
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}

	// 콜백 메소드를 가진 CompletionHandler 객체 생성
	private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {

		@Override
		public void completed(Integer result, Void attachment) {
			System.out.println("completed() 실행: " + result);
		}

		@Override
		public void failed(Throwable exc, Void attachment) {
			System.out.println("failed() 실행: " + exc.toString());

		}

	};

	public void doWork(final String x, final String y) {
		Runnable task = new Runnable() {

			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int res = intX + intY;
					callback.completed(res, null);
				} catch (NumberFormatException e) {
					callback.failed(e, null);
				}
			}

		};
		executorService.submit(task);
	}

	public void finish() {
		executorService.shutdown();
	}

	public static void main(String[] args) {
		CallBackExample callbackExample = new CallBackExample();
		callbackExample.doWork("3", "3");
		callbackExample.doWork("3", "삼");
		callbackExample.finish();

	}
}
