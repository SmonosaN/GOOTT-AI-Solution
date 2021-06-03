package entity;

public class IdealGroup extends Group {

	public IdealGroup() {
		super(0, 0, "", "", 0);
	}
	
	@Override
	public void showGroup() {
		String group = String.format("���� %d ~ %d, ����: %s, ����: %s, �̿� �ð�: %d",
				minAge, maxAge, gender, location, time);
		System.out.println("<�̻����� �׷��� �� ����>");
		System.out.println(group);
	}
	
	@Override
	public void showUserList() {
		System.out.println("<�̻����� �׷��� �� ����Ʈ>");
		if (userList.isEmpty()) {
			System.out.println("�������");
			return;
		}
		for (User user : userList) user.showUser();
	}
}
