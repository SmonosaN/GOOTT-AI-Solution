package application;

import entity.*;
import ui.*;
import usecase.*;

public class App {
	private IdealGroup ideal; // �̻����� �׷�
	private LikelyGroup likey; // ���� ���ɼ��� �ִ� �׷�
	private DefectGroup defect; // �ҷ��� �׷�

	public App() {
		ideal = new IdealGroup();
		likey = new LikelyGroup();
		defect = new DefectGroup(); // ��ü ����
	}

	public void run() {
		UI.information(); // ui ��Ű�� => UI Ŭ���� => information (���θ޴�) ���
		while (true) {
			int select = UI.mainMenu();
			if (select == 1) SetGroupUseCase.execute(ideal, likey, defect);	// 1�� �޴�
			else if (select == 2) SetUserUseCase.execute(ideal, likey, defect);
			else if (select == 3) GetGroupUseCase.execute(ideal, likey, defect);
			else if (select == 4) break;
		}
		System.out.println("���α׷� ����");
	}
}