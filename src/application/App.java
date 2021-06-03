package application;

import entity.*;
import ui.UI;
import usecase.GetGroupUseCase;
import usecase.SetGroupUseCase;

public class App {
	private IdealGroup ideal; // �̻����� �׷�
	private LikelyGroup likey; // ���� ���ɼ��� �ִ� �׷�
	private DefectGroup defect; // �ҷ��� �׷�

	public App() {
		ideal = new IdealGroup();
		likey = new LikelyGroup();
		defect = new DefectGroup();
	}

	public void run() {
		UI.information(); // �츮�� �����ĸ�..!
		while (true) {
			int select = UI.mainMenu();
			if (select == 1) SetGroupUseCase.execute(ideal, likey, defect);
			else if (select == 2)
				// todo: �� ���� �Է�
				break;
			else if (select == 3) GetGroupUseCase.execute(ideal, likey, defect);
			else if (select == 4) {
				System.out.println("����");
				break;
			}
		}
	}
}