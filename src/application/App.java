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
		defect = new DefectGroup(); // 객체 생성
	}

	public void run() {
		UI.information(); // ui 패키지 => UI 클래스 => information (메인메뉴) 출력
		while (true) {
			int select = UI.mainMenu();
			if (select == 1) SetGroupUseCase.execute(ideal, likey, defect);	// 1번 메뉴
			else if (select == 2) SetUserUseCase.execute(ideal, likey, defect);
			else if (select == 3) GetGroupUseCase.execute(ideal, likey, defect);
			else if (select == 4) break;
		}
		System.out.println("프로그램 종료");
	}
}