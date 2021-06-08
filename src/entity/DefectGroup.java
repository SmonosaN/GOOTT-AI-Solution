package entity;

public class DefectGroup extends Group {
	 // defect, ideal, likely 클래스 => Group 클래스에 상속

	public DefectGroup() {
		super(0, 0, "", "", 0); // minAge, maxAge, gender, location, time 설정값 초기화
	}

	@Override
	public void showGroup() {
		String group = String.format("나이 %d ~ %d, 성별: %s, 지역: %s, 이용 시간: %d",
				minAge, maxAge, gender, location, time);	// defect 그룹의 틀 설정
		System.out.println("<불량 그룹의 고객 정보>");
		System.out.println(group);	// 입력한 defect 그룹의 설정값에 따라 출력
	}

	@Override
	public void showUserList() {
		System.out.println("<불량 그룹의 고객 리스트>");
		if (userList.isEmpty()) {	// 만약 userList가 비어있다면
			System.out.println("비어있음");	// 비어있음 메세지 출력
			return;
		}
		for (User user : userList) user.showUser();	// userList가 비어있지 않으면
		// User 클래스 => user 변수에 userList 대로 작성한 값을 넣겠다??
		// showUser 함수에서 선언했던 user 변수를 반복한다. (불량 그룹의 고객 리스트 인원을 전부 보여준다.)
	}
}
