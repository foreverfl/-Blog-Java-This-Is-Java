package standardFunctionalInterface;

import java.util.function.Function;

public class AndThenAndComposeExample {
	public static void main(String[] args) {
		Function<Student, Address> functionA;
		Function<Address, String> functionB;
		Function<Student, String> functionAB;
		String city;

		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();

		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Student("타로", "남자", new Address("한국", "서울")));
		System.out.println("겨주 도시: " + city);

		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Student("타로", "남자", new Address("한국", "서울")));
		System.out.println("겨주 도시: " + city);
	}
}
