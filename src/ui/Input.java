package ui;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {
	final static Scanner INPUT = new Scanner(System.in);

	public static int inputInt(int max) {
		try {
			int input = INPUT.nextInt();
			if (input < 1 || input > max)
				throw new Exception("¹üÀ§´Â 1ºÎÅÍ " + max + "±îÁö");
			return input;
		} catch (Exception e) {
			System.out.println("Àß¸ø ÀÔ·ÂÇß½À´Ï´Ù. " + e.getMessage());
			return -1;
		}
	}
	
	public static String inputGroupString() {
		try {
			String input = INPUT.nextLine();
			// todo: Á¤±ÔÇ¥Çö½ÄÀ¸·Î ideal, likely, defeat È®ÀÎÇÏ±â
			// ¿Â¶óÀÎ »ç¿ë ½Ã°£ ±âÁØÀ¸·Î ºÐ·ù
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
			boolean location_check = Pattern.matches("\\^[°¡-ÆR{2, 4}]\\s[°¡-ÆR{2, 4}]$", input);
			return "";
		} catch (Exception e) {
			return "";
		}
	}

	public static String inputGender() {
		try {
			String input = INPUT.next();
			if (!(input.equals("man") || input.equals("woman")))
				throw new Exception("man, woman ¸¸ ÀÔ·Â °¡´É");
			return input;
		} catch (Exception e) {
			System.out.println("Àß¸ø ÀÔ·ÂÇß½À´Ï´Ù. " + e.getMessage());
			return "";
		}
	}

	public static String inputLocation() {
		try {
			String input = INPUT.next();
			// todo: ÆÈµµ¸¸ ÀÔ·ÂÇÒ ¼ö ÀÖ°Ô!
			return input;
		} catch (Exception e) {
			System.out.println("Àß¸ø ÀÔ·ÂÇß½À´Ï´Ù. " + e.getMessage());
			return "";
		}
	}

	public static String inputString() {
		String input = INPUT.next();
		return input;
//		try {
//			String input = INPUT.nextLine();
//			// todo: Á¤±ÔÇ¥Çö½ÄÀ¸·Î ideal, likely, defact È®ÀÎÇÏ±â
//			return input;
//		}catch (Exception e) {
//			return "";
//		}
	}
}
