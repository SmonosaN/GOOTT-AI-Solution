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
	
	// 고객 정보 생성
	private static void setUserInfo(User user, int i) {
		while (true) {
			int select = UI.userMenu(i);
			if (select == 1) user.setName(UI.nameMenu()); // 이름 
			else if (select == 2) user.setAge(UI.ageMenu()); // 나이
			else if (select == 3) user.setGender(UI.genderMenu()); // 성별
			else if (select == 4) user.setLocation(UI.locationMenu()); // 지역 
			else if (select == 5) user.setTime(UI.timeMenu()); // 이용시간 
			else if (select == 6) break; // 뒤로 가기
		}
	}
	
	// 고객 생성
	private static void setUser(int i) {
		User user = new User();
		setUserInfo(user, i);
		tempUsersMap.put(i, user); // 아직 수정 가능한 고객 정보를 저장
	}
	
	private static void showUsers() {
		if (tempUsersMap.isEmpty()) {
			System.out.println("고객 정보를 생성해주세요!");
			return;
		}
		Iterator<Integer> keys = tempUsersMap.keySet().iterator();
		while (keys.hasNext()) {
			int key = keys.next();
			System.out.printf("<%d 번째 고객 정보>\n", key);
			tempUsersMap.get(key).showUser();
		}
	}
	
	// 고객 정보 수정
	private static void editUser(int numOfUser) {
		int key = UI.userInfoMenu(numOfUser);
		if (key == -1) return;
		User user = tempUsersMap.get(key);
		if (user == null) System.out.println("고객 정보를 생성해주세요!");
		else setUserInfo(user, key);
	}
	
	// 고객 분리
	private static void separate(Group...groups) {
		if (tempUsersMap.isEmpty()) return;
		Iterator<Integer> keys = tempUsersMap.keySet().iterator();
		while (keys.hasNext()) {
			int key = keys.next();
			User user = tempUsersMap.get(key); // 입력받은 고객들을 하나씩 꺼내옴
			for (Group group : groups) { // 모든 그룹을 반복하여 온라인 이용 시간에 맞는 그룹에 저장
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
				if (i > numOfUser) System.out.println("모든 고객을 입력했습니다.");
				else setUser(i++);
			}
			else if (select == 2) showUsers();
			else if (select == 3) editUser(numOfUser);
			else if (select == 4) break;
		}
		separate(ideal, likely, defect);
	}
}
