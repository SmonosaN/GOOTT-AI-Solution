package application;

import entity.*;
import ui.*;
import usecase.*;

public class App {
	private IdealGroup ideal; // 이상적인 그룹
	private LikelyGroup likey; // 변동 가능성이 있는 그룹
	private DefectGroup defect; // 불량한 그룹

	public App() {
		ideal = new IdealGroup();
		likey = new LikelyGroup();
		defect = new DefectGroup();
	}

	public void run() {
		UI.information(); // 우리가 누구냐면..!
		while (true) {
			int select = UI.mainMenu();
			if (select == 1) SetGroupUseCase.execute(ideal, likey, defect);
			else if (select == 2) SetUserUseCase.execute(ideal, likey, defect);
			else if (select == 3) GetGroupUseCase.execute(ideal, likey, defect);
			else if (select == 4) break;
		}
		System.out.println("프로그램 종료");
	}
}