package genericMethod;

public class GenericMethod {
	public static <K, V> boolean compare(GenericType<K, V> o1, GenericType<K, V> o2) {
		boolean keyCompare = o1.getKey().equals(o2.getKey());
		boolean valueCompare = o1.getValue().equals(o2.getValue());
		return keyCompare && valueCompare;
	}
}
