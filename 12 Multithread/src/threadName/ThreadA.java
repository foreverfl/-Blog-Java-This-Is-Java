package threadName;

public class ThreadA extends Thread {

	// 쓰레드 이름 설정
	public ThreadA() {
		setName("ThreadA");
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			// 스레드 이름 얻기
			System.out.println(getName() + "가 출력한 내용");
		}
	}

}
