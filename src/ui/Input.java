package ui;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {
	final static Scanner INPUT = new Scanner(System.in);
	
	public static int inputInt(int max) {
		try {
			int input = INPUT.nextInt();
			if (input < 1 || input > max) throw new Exception("����"); 
			return input;
		} catch(Exception e) {
			System.out.println("�߸� �Է��߽��ϴ�. " + e.getMessage());
			return -1;
		}
	}
	
	public static String inputString() {
		try {
			String input = INPUT.nextLine();
			// todo: ����ǥ�������� ideal, likely, defact Ȯ���ϱ�
			
		}catch (Exception e) {
			
		}
	}
}
