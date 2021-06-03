package util;

/**
 * id ¹ß»ı±â 
 */
public class Generator {
	private static int id = 0;
    
	public static int getId() {
		return ++id;
	}
}
