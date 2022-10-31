package genericMethod;

public class GenericMethodExample {
	public static void main(String[] args) {
		GenericType<Integer, String> genericType1 = new GenericType<Integer, String>(1, "사과");
		GenericType<Integer, String> genericType2 = new GenericType<Integer, String>(1, "사과");

		// 구체적인 타입을 명시적으로 지정한다.
		boolean result1 = GenericMethod.<Integer, String>compare(genericType1, genericType2);
		if (result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}

		GenericType<String, String> genericType3 = new GenericType<String, String>("유저1", "모구모구");
		GenericType<String, String> genericType4 = new GenericType<String, String>("유저2", "모구모구");

		// 구체적인 타입을 명시적으로 지정한다.
		boolean result2 = GenericMethod.compare(genericType3, genericType4);
		if (result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
	}
}
