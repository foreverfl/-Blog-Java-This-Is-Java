package multiTypePamameter;

public class MultiTypeParameterExample {
	public static void main(String[] args) {
		MultiTypeParameter<String, String> multiTypeParameter = new MultiTypeParameter<>();
		multiTypeParameter.setKind("스마트TV");
		multiTypeParameter.setModel("삼성");
		String tv = multiTypeParameter.getKind();
		String tvModel = multiTypeParameter.getModel();
		System.out.println("multiTypeParameter");
		System.out.println(tv);
		System.out.println(tvModel);
	}
}
