package ui;

public class UI {
	public static void information() {
		System.out.println("============================");
		System.out.println("Title: Customer Segmentation");
		System.out.println("Developers : �뼺��, ����ȣ");
		System.out.println("Email : bbaktaeho@kakao.com");
		System.out.println("============================");
	}

	public static int mainMenu() {
		System.out.println();
		System.out.println("============================");
		System.out.println("1. �׷� ����");
		System.out.println("2. �� ���� �Է�");
		System.out.println("3. �׷캰 �� ����Ʈ ��ȸ");
		System.out.println("4. ����");
		System.out.println("============================");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		return Input.inputInt(4);
	}
	
	public static String selectGroupMenu() {
		System.out.print("�׷��� �Է��ϼ��� (ideal, likely, defect) : ");
		return Input.inputString();
	}
	
	public static int groupSettingMenu(String groupName) {
		System.out.println();
		System.out.println("[" + groupName + "]");
		System.out.println("============================");
		System.out.println("1. �׷캰 �� ���� ���� �� ����");
		System.out.println("2. �׷캰 �� ���� ��ȸ");
		System.out.println("3. �ڷ� ����");
		System.out.println("============================");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		return Input.inputInt(3);
	}

	public static int userSettingMenu(int number) {
		System.out.println();
		System.out.println(number + " ��°");
		System.out.println("============================");
		System.out.println("1. �� ���� ����");
		System.out.println("2. �� ���� ��ȸ");
		System.out.println("3. �� ���� ����");
		System.out.println("4. �ڷ� ����");
		System.out.println("============================");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		return Input.inputInt(4);
	}
	
	public static int userMenu(int number) {
		System.out.println();
		System.out.println(number + " ��° ��");
		System.out.println("============================");
		System.out.println("1. �̸�");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ����");
		System.out.println("5. �¶��� ��� �ð�");
		System.out.println("6. �ڷ� ����");
		System.out.println("============================");
		return Input.inputInt(6);
	}
	
	public static int userInGroupSettingMenu() {
		System.out.println();
		System.out.println("============================");
		System.out.println("1. ���� ���̿� �ִ� ����");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. �¶��� ��� �ð�");
		System.out.println("5. �ڷ� ����");
		System.out.println("============================");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		return Input.inputInt(5);
	}
	
	public static int minAgeInGroupMenu() {
		System.out.print("���� ���̸� �Է��ϼ��� : ");
		return Input.inputInt(100);
	}
	
	public static int maxAgeInGroupMenu() {
		System.out.print("�ִ� ���̸� �Է��ϼ��� : ");
		return Input.inputInt(100);
	}
	
	public static String genderMenu() {
		System.out.print("������ �Է��ϼ��� : ");
		return Input.inputGenter();
	}
	
	public static String locationMenu() {
		System.out.print("������ �Է��ϼ��� : ");
		return Input.inputLocation();
	}
	
	public static int timeMenu() {
		System.out.print("�¶��� ��� �ð��� �Է��ϼ��� : ");
		return Input.inputInt(23);
	}
	
	public static int numOfUserMenu() {
		System.out.print("���� ���� �Է��ϼ��� (-1 : �ڷ� ����) : ");
		return Input.inputInt(Integer.MAX_VALUE);
	}

	public static void cusName() {
		System.out.print("���� �̸��� �Է��ϼ��� : ");
	}

	public static void cusAge() {
		System.out.print("���� ���̸� �Է��ϼ��� : ");
	}

	public static void cusGender() {
		System.out.print("���� ������ �Է��ϼ��� : ");
	}

	public static void cusLocation() {
		System.out.print("���� ������ �Է��ϼ��� : ");
	}

	public static void cusOnline() {
		System.out.print("���� �¶��� ��� �ð��� �Է��ϼ��� : ");
	}
}
