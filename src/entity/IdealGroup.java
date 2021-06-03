package entity;

public class IdealGroup extends Group {

	IdealGroup(int minAge, int maxAge, String gender, String location, int time) {
		super(minAge, maxAge, gender, location, time);
	}

	@Override
	public void showGroup() {
		String group = String.format("���� %d ~ %d, ����: %s, ����: %s, �̿� �ð�: %d",
				minAge, maxAge, gender, location, time);
		System.out.println("�̻����� �׷��� �� ���� -> " + group);
	}
	
	@Override
	public void showUserList() {
		System.out.println("<�̻��� �׷��� �� ����Ʈ>");
		for (User user : userList) user.showUser();
	}
}
