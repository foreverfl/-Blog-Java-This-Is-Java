package threadName;

public class ThreadB extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			// 스레드 이름 얻기
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
