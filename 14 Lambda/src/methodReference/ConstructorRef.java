package methodReference;

public class ConstructorRef {
	private String name;
	private String id;

	public ConstructorRef() {
		System.out.println("기본 생성자");
	}

	public ConstructorRef(String id) {
		System.out.println("매개값 1개");
		this.id = id;
	}

	public ConstructorRef(String name, String id) {
		System.out.println("매개값 2개");
		this.name = name;
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
