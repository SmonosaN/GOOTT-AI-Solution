package ui;
import java.util.Scanner;

public class Input {
	final static Scanner INPUT = new Scanner(System.in);
	
	public static int inputInt() {
		try {
			return INPUT.nextInt();
		} catch(Exception e) {
			System.out.println("���� �Է��ϼ���.");
			return -1;
		}
	}
}
