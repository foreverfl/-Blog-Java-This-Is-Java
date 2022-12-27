package methodReference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorRefExample {
	public static void main(String[] args) {
		// 생성자 참조
		Function<String, ConstructorRef> function1 = ConstructorRef::new;
		ConstructorRef constructorRef1 = function1.apply("mogumogu");

		// 생성자 참조
		BiFunction<String, String, ConstructorRef> function2 = ConstructorRef::new;
		ConstructorRef constructorRef2 = function2.apply("mogumogu", "타로");

	}
}
