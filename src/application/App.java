package application;

import ui.Input;
import ui.UI;

public class App {
	
	public static void run() {
		UI.information();
		while (true) {
			UI.menu();
			int select = Input.inputInt();
			if (select == 4) break;
		}
	}
	
}
