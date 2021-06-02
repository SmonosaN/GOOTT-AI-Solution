package ui;
import java.util.Scanner;

public class Input {
	final static Scanner INPUT = new Scanner(System.in);
	
	public static int inputInt() {
		try {
			return INPUT.nextInt();
		} catch(Exception e) {
			System.out.println("수를 입력하세요.");
			return -1;
		}
	}
}
