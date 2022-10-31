package limitedTypeParameter;

public class LimitedTypeParameterExample {
	public static void main(String[] args) {
		// int → Integer
		int result1 = LimitedTypeParameter.compare(10, 20);
		System.out.println(result1);

		// double → Double 
		int result2 = LimitedTypeParameter.compare(4.5, 3);
		System.out.println(result2);
	}
}
