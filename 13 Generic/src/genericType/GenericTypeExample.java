package genericType;

public class GenericTypeExample {
	public static void main(String[] args) {
		GenericType<String> box1 = new GenericType<String>();
		box1.set("hello");
		String str = box1.get();
		System.out.println(str);

		GenericType<Integer> box2 = new GenericType<Integer>();
		box2.set(6);
		int value = box2.get();
		System.out.println(value);
	}
}
