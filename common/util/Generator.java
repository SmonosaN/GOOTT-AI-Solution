package util;

/**
 * id �߻��� 
 */
public class Generator {
	private static int id = 0;	// id �� �ʱ�ȭ
    
	public static int getId() {
		return ++id;	// id �� ����
	}
}
