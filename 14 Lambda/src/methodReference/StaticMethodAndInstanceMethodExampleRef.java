package methodReference;

import java.util.function.IntBinaryOperator;

public class StaticMethodAndInstanceMethodExampleRef {
	public static void main(String[] args) {
		IntBinaryOperator operator;

		// 정적 메소드 참조
		operator = (x, y) -> StaticMethodAndInstanceMethodRef.staticMethod(x, y);
		System.out.println("결과1: " + operator.applyAsInt(3, 4));

		operator = StaticMethodAndInstanceMethodRef::staticMethod;
		System.out.println("결과2: " + operator.applyAsInt(3, 4));

		// 인스턴스 메소드 참조
		StaticMethodAndInstanceMethodRef obj = new StaticMethodAndInstanceMethodRef();
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("결과3: " + operator.applyAsInt(3, 4));

		operator = obj::instanceMethod;
		System.out.println("결과4: " + operator.applyAsInt(3, 4));

	}
}
