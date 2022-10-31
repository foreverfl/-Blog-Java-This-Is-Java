package multiTypePamameter;

public class MultiTypeParameterExample {
	public static void main(String[] args) {
		MultiTypeParameter<String, String> product1 = new MultiTypeParameter<>();
		product1.setKind("스마트TV");
		product1.setModel("삼성");
		String tv = product1.getKind();
		String tvModel = product1.getModel();
		System.out.println("product1");
		System.out.println(tv);
		System.out.println(tvModel);
		System.out.println();
	}
}
