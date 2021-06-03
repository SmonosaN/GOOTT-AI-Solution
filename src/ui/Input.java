package ui;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {
	final static Scanner INPUT = new Scanner(System.in);
	
	public static int inputInt(int max) {
		try {
			int input = INPUT.nextInt();
			if (input < 1 || input > max) throw new Exception("범위"); 
			return input;
		} catch(Exception e) {
			System.out.println("잘못 입력했습니다. " + e.getMessage());
			return -1;
		}
	}
	
	public static String inputGroupString() {
		try {
			String input = INPUT.nextLine();
			// todo: 정규표현식으로 ideal, likely, defeat 확인하기
			// 온라인 사용 시간 기준으로 분류
			// A = 21 ~ , B = 11 ~ 20, C = 1 ~ 10
			boolean time_checkA = Pattern.matches("\\d{21, }", input);	// ideal
			boolean time_checkB = Pattern.matches("\\d{11, 20}", input);	// likely
			boolean time_checkC = Pattern.matches("\\d{1,10}", input);	// defeat
		}catch (Exception e) {
			
		}
	}
	public static String inputLocationString() {
		try {
			String input = INPUT.nextLine();
			boolean location_check = Pattern.matches("\\^[가-힣{2, 4}]\\s[가-힣{2, 4}]$", input);
		} catch (Exception e) {
			
		}
	}
}
