package threadName;

public class ThreadMain {
	public static void main(String args[]) {
		Thread threadMain = Thread.currentThread();
		System.out.println("메인 스레드 이름: " + threadMain.getName());

		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());

		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
	}
}
