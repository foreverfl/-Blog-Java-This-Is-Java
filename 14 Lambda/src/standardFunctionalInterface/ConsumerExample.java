package standardFunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		// 객체 T를 받아 소비한다.
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");

		// 객체 T와 U를 받아 소비한다.
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		bigConsumer.accept("java", "8");

		// double 값을 받아 소비한다.
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0);

		// 겍체 T와 int 값을 받아 소비한다.
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("java", 8);

	}
}
