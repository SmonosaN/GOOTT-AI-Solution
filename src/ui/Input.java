package ui;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {
	final static Scanner INPUT = new Scanner(System.in);

	public static int inputInt(int max) {	// 메뉴 선택 함수, 정수형 max변수 선언
		try {
			int input = INPUT.nextInt();	// 정수형 변수 input에 입력받은 INPUT 값을 넣는다.
			if (input < 1 || input > max)	// 만약 input값이 1보다 작거나 max값보다 크다면
				throw new Exception("범위는 1부터 " + max + "까지");	
				// Exception(예외) 처리하고, 메세지를 출력한다. (메뉴 번호는 1~max값 까지)
			return input;
		} catch (Exception e) {	// 예외처리 받는 부분
			System.out.println("잘못 입력했습니다. " + e.getMessage());	// 
			return -1;
		}
	}
	
	public static String inputGroupString() {
		try {
			String input = INPUT.next();
			// todo: 정규표현식으로 ideal, likely, defeat 확인하기
			
			return "";
		}catch (Exception e) {
			System.out.println("잘못 입력했습니다. ideal, likely, defect 중에 선택해주세요.");
			return "";
		}
	}
	public static String inputLocationString() {
		try {
			String input = INPUT.next();
			boolean location_check = Pattern.matches("\\^[가-힣{2, 4}]\\s[가-힣{2, 4}]$", input);
			return "";
		} catch (Exception e) {
			return "";
		}
	}

	public static String inputGender() {
		try {
			String input = INPUT.next();
			if (!(input.equals("man") || input.equals("woman"))) throw new Exception("man, woman 만 입력 가능");
			return input;
		} catch (Exception e) {
			System.out.println("잘못 입력했습니다. " + e.getMessage());
			return "";
		}
	}

	public static String inputLocation() {
		try {
			String input = INPUT.next();
			// todo: 팔도만 입력할 수 있게!
			return input;
		} catch (Exception e) {
			System.out.println("잘못 입력했습니다. " + e.getMessage());
			return "";
		}
	}

	// 임시 메소드
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
