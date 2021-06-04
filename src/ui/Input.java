package ui;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {
	final static Scanner INPUT = new Scanner(System.in);

	public static int inputInt(int max) {
		try {
			int input = INPUT.nextInt();
			if (input < 1 || input > max)
				throw new Exception("������ 1���� " + max + "����");
			return input;
		} catch (Exception e) {
			System.out.println("�߸� �Է��߽��ϴ�. " + e.getMessage());
			return -1;
		}
	}
	
	public static String inputGroupString() {
		try {
			String input = INPUT.nextLine();
			// todo: ����ǥ�������� ideal, likely, defeat Ȯ���ϱ�
			// �¶��� ��� �ð� �������� �з�
			// A = 21 ~ , B = 11 ~ 20, C = 1 ~ 10
			boolean time_checkA = Pattern.matches("\\d{21, }", input);	// ideal
			boolean time_checkB = Pattern.matches("\\d{11, 20}", input);	// likely
			boolean time_checkC = Pattern.matches("\\d{1,10}", input);	// defeat
			return "";
		}catch (Exception e) {
			return "";
		}
	}
	public static String inputLocationString() {
		try {
			String input = INPUT.nextLine();
			boolean location_check = Pattern.matches("\\^[��-�R{2, 4}]\\s[��-�R{2, 4}]$", input);
			return "";
		} catch (Exception e) {
			return "";
		}
	}

	public static String inputGender() {
		try {
			String input = INPUT.next();
			if (!(input.equals("man") || input.equals("woman")))
				throw new Exception("man, woman �� �Է� ����");
			return input;
		} catch (Exception e) {
			System.out.println("�߸� �Է��߽��ϴ�. " + e.getMessage());
			return "";
		}
	}

	public static String inputLocation() {
		try {
			String input = INPUT.next();
			// todo: �ȵ��� �Է��� �� �ְ�!
			return input;
		} catch (Exception e) {
			System.out.println("�߸� �Է��߽��ϴ�. " + e.getMessage());
			return "";
		}
	}

	public static String inputString() {
		String input = INPUT.next();
		return input;
//		try {
//			String input = INPUT.nextLine();
//			// todo: ����ǥ�������� ideal, likely, defact Ȯ���ϱ�
//			return input;
//		}catch (Exception e) {
//			return "";
//		}
	}
}
