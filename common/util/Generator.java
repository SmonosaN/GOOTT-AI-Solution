package util;

/**
 * id �߻��� 
 */
public class Generator {
	private static int id = 0;
    
	public static int getId() {
		return ++id;
	}
}
