package application;

import ui.UI;

public class App {
	
	public static void run() {
		UI.information();
		while (true) {
			try {
				int select = UI.mainMenu();
				switch (select) {
					case 1: break;
					case 2: break;
					case 3: break;
					case 4: System.out.println("Á¾·á"); break;
				}
			} catch(Exception e) {
				String error = e.getMessage();
				System.out.println(error);
				continue;
			}
		}
	}
}