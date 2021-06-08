package util;

/**
 * id 발생기 
 */
public class Generator {
	private static int id = 0;	// id 값 초기화
    
	public static int getId() {
		return ++id;	// id 값 증가
	}
}
