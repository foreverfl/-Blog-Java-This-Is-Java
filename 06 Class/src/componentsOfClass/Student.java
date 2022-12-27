package componentsOfClass;

import java.util.ArrayList;
import java.util.List;

public class Student {
	// 필드
	String name;
	int height;
	String num;
	List<String> friends = new ArrayList<>();

	// 생성자
	// 기본 생성자
	Student() {
	}

	Student(String name, int height, String num) {
		this.name = name;
		this.height = height;
		this.num = num;
	}

	// this를 이용한 생성자
	Student(String name, int height) {
		this(name, height, "20200000");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", height=" + height + ", num=" + num + "]";
	}

	// 리턴 값이 있는 메소드
	// 친구가 몇 명인지 알려준다.
	int countFriends() {
		return friends.size();
	}

	// 모든 친구를 출력한다.
	List<String> showAllFriends() {
		List<String> res = new ArrayList<>();
		for (int i = 0; i < friends.size(); i++) {
			res.add(friends.get(i));
		}
		return res;
	}

	// 리턴 값이 없는 메소드
	// 친구를 추가한다.
	void addFriends(String friend) {
		this.friends.add(friend);
	}

	// 메소드 오버로딩
	void addFriends() {
		this.friends.add("유령");
	}

}
