package entity;

public class LikelyGroup extends Group {

	public LikelyGroup() {
		super(0, 0, "", "", 0);
	}

	@Override
	public void showGroup() {
		String group = String.format("���� %d ~ %d, ����: %s, ����: %s, �̿� �ð�: %d",
				minAge, maxAge, gender, location, time);
		System.out.println("<���� ���ɼ� �׷��� �� ����>");
		System.out.println(group);
	}
	
	@Override
	public void showUserList() {
		System.out.println("<���� ���ɼ� �׷��� �� ����Ʈ>");
		if (userList.isEmpty()) return;
		for (User user : userList) user.showUser();
	}
}
