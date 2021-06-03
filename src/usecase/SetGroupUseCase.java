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
			if (select == 1) group.setMinAge(0);
			if (select == 2) group.setMaxAge(0);
			if (select == 3) group.setGender(null);
			if (select == 4) group.setLocation(null);
			if (select == 5) group.setTime(0);
			if (select == 6) break;
		}
		
	}
	
	private static void setGroup(Group group) {	
		while (true) {
			int select = UI.groupSettingMenu();
			if (select == 1) setUserInGroup(group);
			if (select == 2) group.showGroup();
			if (select == 3) break;
		}
	}

	public static void execute(IdealGroup ideal, LikelyGroup likely, DefectGroup defect) {
		while (true) {
			String group = UI.selectGroupMenu();
			
			if (group.equals("ideal")) {
				setGroup(ideal);
				break;
			}
			if (group.equals("likely")) {
				setGroup(likely);
				break;
			}
			if (group.equals("defect")) {
				setGroup(defect);
				break;
			}
			// todo: Input Ŭ�������� �����ڵ鸵�� �ȴٸ� ���� ���� 
			System.out.println("���� �׷��Դϴ�. �ٽ� �Է����ּ���.");
		}
	}
}
