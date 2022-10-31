package genericType;

public class GenericTypeExample {
	public static void main(String[] args) {
		GenericType<String> genericType1 = new GenericType<String>();
		genericType1.set("hello");
		String str = genericType1.get();
		System.out.println(str);

		GenericType<Integer> genericType2 = new GenericType<Integer>();
		genericType2.set(6);
		int value = genericType2.get();
		System.out.println(value);
	}
}
