package usecase;

import entity.DefectGroup;
import entity.IdealGroup;
import entity.LikelyGroup;
import ui.UI;

public class SetUserUseCase {

	public static void execute(IdealGroup ideal, LikelyGroup likely, DefectGroup defect) {
		int numOfUser = UI.numOfUserMenu();
		if (numOfUser == -1) return;
		for (int i = 1; i <= numOfUser; i++) {
			int select = UI.userSettingMenu(i);
			if (select == 1) {}
			else if (select == 2) {}
			else if (select == 3) {}
			else if (select == 4) break;
		}
	}
}
