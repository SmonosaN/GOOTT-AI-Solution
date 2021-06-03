package entity;

public class IdealGroup extends Group {

	IdealGroup(int minAge, int maxAge, String gender, String location, int time) {
		super(minAge, maxAge, gender, location, time);
	}

	@Override
	public void showGroup() {
		String group = String.format("나이 %d ~ %d, 성별: %s, 지역: %s, 이용 시간: %d",
				minAge, maxAge, gender, location, time);
		System.out.println("이상적인 그룹의 고객 정보 -> " + group);
	}
	
	@Override
	public void showUserList() {
		System.out.println("<이상적 그룹의 고객 리스트>");
		for (User user : userList) user.showUser();
	}
}
