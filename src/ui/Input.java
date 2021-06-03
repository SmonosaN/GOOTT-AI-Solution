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

	public static String inputGenter() {
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
