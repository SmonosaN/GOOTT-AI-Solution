package ui;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {
	final static Scanner INPUT = new Scanner(System.in);

	public static int inputInt(int max) {	// ¸Ş´º ¼±ÅÃ ÇÔ¼ö, Á¤¼öÇü maxº¯¼ö ¼±¾ğ
		try {
			int input = INPUT.nextInt();	// Á¤¼öÇü º¯¼ö input¿¡ ÀÔ·Â¹ŞÀº INPUT °ªÀ» ³Ö´Â´Ù.
			if (input < 1 || input > max)	// ¸¸¾à input°ªÀÌ 1º¸´Ù ÀÛ°Å³ª max°ªº¸´Ù Å©´Ù¸é
				throw new Exception("¹üÀ§´Â 1ºÎÅÍ " + max + "±îÁö");	
				// Exception(¿¹¿Ü) Ã³¸®ÇÏ°í, ¸Ş¼¼Áö¸¦ Ãâ·ÂÇÑ´Ù. (¸Ş´º ¹øÈ£´Â 1~max°ª ±îÁö)
			return input;
		} catch (Exception e) {	// ¿¹¿ÜÃ³¸® ¹Ş´Â ºÎºĞ
			System.out.println("Àß¸ø ÀÔ·ÂÇß½À´Ï´Ù. " + e.getMessage());	// 
			return -1;
		}
	}
	
	public static String inputGroupString() {
		try {
			String input = INPUT.next();
			// todo: Á¤±ÔÇ¥Çö½ÄÀ¸·Î ideal, likely, defeat È®ÀÎÇÏ±â
			
			return "";
		}catch (Exception e) {
			System.out.println("Àß¸ø ÀÔ·ÂÇß½À´Ï´Ù. ideal, likely, defect Áß¿¡ ¼±ÅÃÇØÁÖ¼¼¿ä.");
			return "";
		}
	}
	public static String inputLocationString() {
		try {
			String input = INPUT.next();
			boolean location_check = Pattern.matches("\\^[°¡-ÆR{2, 4}]\\s[°¡-ÆR{2, 4}]$", input);
			return "";
		} catch (Exception e) {
			return "";
		}
	}

	public static String inputGender() {
		try {
			String input = INPUT.next();
			if (!(input.equals("man") || input.equals("woman"))) throw new Exception("man, woman ¸¸ ÀÔ·Â °¡´É");
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

	// ÀÓ½Ã ¸Ş¼Òµå
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
