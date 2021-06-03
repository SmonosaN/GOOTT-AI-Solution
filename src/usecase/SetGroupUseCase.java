package usecase;

import entity.DefectGroup;
import entity.Group;
import entity.IdealGroup;
import entity.LikelyGroup;
import ui.UI;

public class SetGroupUseCase {
	private static void setUserInGroup(Group group) {
		while (true) {
			int select = UI.userInGroupSettingMenu();
			if (select == 1) {
				group.setMinAge(UI.minAgeInGroupMenu());
				group.setMaxAge(UI.maxAgeInGroupMenu());
			}
			if (select == 2) group.setGender(UI.genderMenu());
			if (select == 3) group.setLocation(UI.locationMenu());
			if (select == 4) group.setTime(UI.timeMenu());
			if (select == 5) break;
		}
	}
	
	private static void setGroup(Group group, String groupName) {	
		while (true) {
			int select = UI.groupSettingMenu(groupName);
			if (select == 1) setUserInGroup(group);
			if (select == 2) group.showGroup();
			if (select == 3) break;
		}
	}

	public static void execute(IdealGroup ideal, LikelyGroup likely, DefectGroup defect) {
		while (true) {
			String group = UI.selectGroupMenu();
			
			if (group.equals("ideal")) {
				setGroup(ideal, group);
				break;
			}
			if (group.equals("likely")) {
				setGroup(likely, group);
				break;
			}
			if (group.equals("defect")) {
				setGroup(defect, group);
				break;
			}
			// todo: Input 클래스에서 에러핸들링이 된다면 지울 예정 
			System.out.println("없는 그룹입니다. 다시 입력해주세요.");
		}
	}
}
