package classMemberAndLocalVariable;

public class UsingLocalVariable {
	void method(int arg) { // arg는 final 특성을 가지므로 변경할 수 없다.
		int localVar = 40; // localVar는 final 특성을 가지므로 변경할 수 없다.
		
		MyFunctionalInterface fi = () -> {
			// 로컬 변수 읽기
			System.out.println("arg: " + arg);
			System.out.println("localVAr: " + localVar);
		};
		fi.method();
	}
}
