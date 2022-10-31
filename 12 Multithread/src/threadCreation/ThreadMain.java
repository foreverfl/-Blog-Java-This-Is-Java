package threadCreation;

public class ThreadMain {
	
	public static void main(String[] args) {
		Runnable beepThread = new ThreadBeep();
		Thread thread = new Thread(beepThread);
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
