package usecase;

import java.util.HashMap;
import java.util.Iterator;

import entity.DefectGroup;
import entity.Group;
import entity.IdealGroup;
import entity.LikelyGroup;
import entity.User;
import ui.UI;

public class SetUserUseCase {
	static HashMap<Integer, User> tempUsersMap = new HashMap<>();
	
	// �� ���� ����
	private static void setUserInfo(User user, int i) {
		while (true) {
			int select = UI.userMenu(i);
			if (select == 1) user.setName(UI.nameMenu()); // �̸� 
			else if (select == 2) user.setAge(UI.ageMenu()); // ����
			else if (select == 3) user.setGender(UI.genderMenu()); // ����
			else if (select == 4) user.setLocation(UI.locationMenu()); // ���� 
			else if (select == 5) user.setTime(UI.timeMenu()); // �̿�ð� 
			else if (select == 6) break; // �ڷ� ����
		}
	}
	
	// �� ����
	private static void setUser(int i) {
		User user = new User();
		setUserInfo(user, i);
		tempUsersMap.put(i, user); // ���� ���� ������ �� ������ ����
	}
	
	private static void showUsers() {
		if (tempUsersMap.isEmpty()) {
			System.out.println("�� ������ �������ּ���!");
			return;
		}
		Iterator<Integer> keys = tempUsersMap.keySet().iterator();
		while (keys.hasNext()) {
			int key = keys.next();
			System.out.printf("<%d ��° �� ����>\n", key);
			tempUsersMap.get(key).showUser();
		}
	}
	
	// �� ���� ����
	private static void editUser(int numOfUser) {
		int key = UI.userInfoMenu(numOfUser);
		if (key == -1) return;
		User user = tempUsersMap.get(key);
		if (user == null) System.out.println("�� ������ �������ּ���!");
		else setUserInfo(user, key);
	}
	
	// �� �и�
	private static void separate(Group...groups) {
		if (tempUsersMap.isEmpty()) return;
		Iterator<Integer> keys = tempUsersMap.keySet().iterator();
		while (keys.hasNext()) {
			int key = keys.next();
			User user = tempUsersMap.get(key); // �Է¹��� ������ �ϳ��� ������
			for (Group group : groups) { // ��� �׷��� �ݺ��Ͽ� �¶��� �̿� �ð��� �´� �׷쿡 ����
				if (user.getTime() == group.getTime()) {
					group.getUserList().add(user);
					break;
				}
			}
		}
	}

	public static void execute(IdealGroup ideal, LikelyGroup likely, DefectGroup defect) {
		int numOfUser = UI.numOfUserMenu();
		if (numOfUser == -1) return;
		
		int i = 1;
		while (true) {
			int select = UI.userSettingMenu();
			if (select == 1) {
				if (i > numOfUser) System.out.println("��� ���� �Է��߽��ϴ�.");
				else setUser(i++);
			}
			else if (select == 2) showUsers();
			else if (select == 3) editUser(numOfUser);
			else if (select == 4) break;
		}
		separate(ideal, likely, defect);
	}
}
