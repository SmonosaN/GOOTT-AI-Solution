package ui;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {
	final static Scanner INPUT = new Scanner(System.in);
	
	public static int inputInt(int max) {
		try {
			int input = INPUT.nextInt();
			if (input < 1 || input > max) throw new Exception("범위는 1부터 "+max+"까지"); 
			return input;
		} catch(Exception e) {
			System.out.println("잘못 입력했습니다. " + e.getMessage());
			return -1;
		}
	}
	
	public static String inputString() {
		String input = INPUT.next();
		return input;
//		try {
//			String input = INPUT.nextLine();
//			// todo: 정규표현식으로 ideal, likely, defact 확인하기
//			return input;
//		}catch (Exception e) {
//			return "";
//		}
	}
}
