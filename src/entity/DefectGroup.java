package entity;

public class DefectGroup extends Group {

	public DefectGroup() {
		super(0, 0, "", "", 0);
	}

	@Override
	public void showGroup() {
		String group = String.format("나이 %d ~ %d, 성별: %s, 지역: %s, 이용 시간: %d",
				minAge, maxAge, gender, location, time);
		System.out.println("<불량 그룹의 고객 정보>");
		System.out.println(group);
	}

	@Override
	public void showUserList() {
		System.out.println("<불량 그룹의 고객 리스트>");
		if (userList.isEmpty()) {
			System.out.println("비어있음");
			return;
		}
		for (User user : userList) user.showUser();
	}
}
