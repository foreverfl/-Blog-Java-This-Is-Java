package componentsOfClass;

public class StudentExample {

	public static void main(String[] args) {
		// 기본 생성자를 통한 객체 생성
		Student haruka = new Student();
		haruka.name = "하루카";
		haruka.height = 150;
		haruka.num = "20200001";

		System.out.println(haruka);

		// 선언한 생성자를 통한 객체 생성
		Student takahashi = new Student("다카하시", 155, "20200002");
		System.out.println(takahashi);

		// 메소드 호출
		haruka.addFriends("아츠키");
		haruka.addFriends("츠요시");
		haruka.addFriends("키무라");
		haruka.addFriends();
		System.out.println("친구의 수를 보여줍니다.");
		System.out.println(haruka.countFriends());
		System.out.println("모든 친구를 보여줍니다.");
		System.out.println(haruka.showAllFriends().toString());
	}

}
