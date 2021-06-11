package ui;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {
	final static Scanner INPUT = new Scanner(System.in);

	public static int inputInt(int max) {	// �޴� ���� �Լ�, ������ max���� ����
		try {
			int input = INPUT.nextInt();	// ������ ���� input�� �Է¹��� INPUT ���� �ִ´�.
			if (input < 1 || input > max)	// ���� input���� 1���� �۰ų� max������ ũ�ٸ�
				throw new Exception("������ 1���� " + max + "����");	
				// Exception(����) ó���ϰ�, �޼����� ����Ѵ�. (�޴� ��ȣ�� 1~max�� ����)
			return input;
		} catch (Exception e) {	// ����ó�� �޴� �κ�
			System.out.println("�߸� �Է��߽��ϴ�. " + e.getMessage());	// 
			return -1;
		}
	}
	
	public static String inputGroupString() {
		try {
			String input = INPUT.next();
			// todo: ����ǥ�������� ideal, likely, defeat Ȯ���ϱ�
			
			return "";
		}catch (Exception e) {
			System.out.println("�߸� �Է��߽��ϴ�. ideal, likely, defect �߿� �������ּ���.");
			return "";
		}
	}
	public static String inputLocationString() {
		try {
			String input = INPUT.next();
			boolean location_check = Pattern.matches("\\^[��-�R{2, 4}]\\s[��-�R{2, 4}]$", input);
			return "";
		} catch (Exception e) {
			return "";
		}
	}

	public static String inputGender() {
		try {
			String input = INPUT.next();
			if (!(input.equals("man") || input.equals("woman"))) throw new Exception("man, woman �� �Է� ����");
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

	// �ӽ� �޼ҵ�
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
