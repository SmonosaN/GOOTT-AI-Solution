package usecase;

import entity.DefectGroup;
import entity.IdealGroup;
import entity.LikelyGroup;
import entity.User;
import ui.UI;

public class SetUserUseCase {
	private static void setUser(int i) {
		User user = new User();
		while (true) {
			int select = UI.userMenu(i);
			if (select == 1) {}
			else if (select == 2) {}
			else if (select == 3) {}
			else if (select == 4) {}
			else if (select == 5) {}
			else if (select == 6) break;
		}
	}
	
	private static void showUser() {
		
	}
	
	private static void editUser() {
		
	}

	public static void execute(IdealGroup ideal, LikelyGroup likely, DefectGroup defect) {
		int numOfUser = UI.numOfUserMenu();
		if (numOfUser == -1) return;
		for (int i = 1; i <= numOfUser; i++) {
			int select = UI.userSettingMenu(i);
			if (select == 1) setUser(i);
			else if (select == 2) {}
			else if (select == 3) {}
			else if (select == 4) break;
		}
	}
}
