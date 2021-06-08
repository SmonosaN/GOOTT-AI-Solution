package entity;

public class DefectGroup extends Group {
	 // defect, ideal, likely Ŭ���� => Group Ŭ������ ���

	public DefectGroup() {
		super(0, 0, "", "", 0); // minAge, maxAge, gender, location, time ������ �ʱ�ȭ
	}

	@Override
	public void showGroup() {
		String group = String.format("���� %d ~ %d, ����: %s, ����: %s, �̿� �ð�: %d",
				minAge, maxAge, gender, location, time);	// defect �׷��� Ʋ ����
		System.out.println("<�ҷ� �׷��� �� ����>");
		System.out.println(group);	// �Է��� defect �׷��� �������� ���� ���
	}

	@Override
	public void showUserList() {
		System.out.println("<�ҷ� �׷��� �� ����Ʈ>");
		if (userList.isEmpty()) {	// ���� userList�� ����ִٸ�
			System.out.println("�������");	// ������� �޼��� ���
			return;
		}
		for (User user : userList) user.showUser();	// userList�� ������� ������
		// User Ŭ���� => user ������ userList ��� �ۼ��� ���� �ְڴ�??
		// showUser �Լ����� �����ߴ� user ������ �ݺ��Ѵ�. (�ҷ� �׷��� �� ����Ʈ �ο��� ���� �����ش�.)
	}
}
