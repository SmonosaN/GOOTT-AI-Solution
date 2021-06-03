package ui;

public class UI {
	public static void information() {
		System.out.println("============================");
		System.out.println("Title: Customer Segmentation");
		System.out.println("Developers : 노성민, 임태호");
		System.out.println("Email : bbaktaeho@kakao.com");
		System.out.println("============================");
	}

	public static int mainMenu() {
		System.out.println();
		System.out.println("============================");
		System.out.println("1. 그룹 설정");
		System.out.println("2. 고객 정보 입력");
		System.out.println("3. 그룹별 고객 리스트 조회");
		System.out.println("4. 종료");
		System.out.println("============================");
		System.out.print("메뉴 번호를 입력하세요 : ");
		return Input.inputInt(4);
	}
	
	public static String selectGroupMenu() {
		System.out.print("그룹을 입력하세요 (ideal, likely, defect) : ");
		return Input.inputString();
	}
	
	public static int groupSettingMenu(String groupName) {
		System.out.println();
		System.out.println("[" + groupName + "]");
		System.out.println("============================");
		System.out.println("1. 그룹별 고객 정보 설정 및 수정");
		System.out.println("2. 그룹별 고객 정보 조회");
		System.out.println("3. 뒤로 가기");
		System.out.println("============================");
		System.out.print("메뉴 번호를 입력하세요 : ");
		return Input.inputInt(3);
	}

	public static int userSettingMenu(int number) {
		System.out.println();
		System.out.println(number + " 번째");
		System.out.println("============================");
		System.out.println("1. 고객 정보 생성");
		System.out.println("2. 고객 정보 조회");
		System.out.println("3. 고객 정보 수정");
		System.out.println("4. 뒤로 가기");
		System.out.println("============================");
		System.out.print("메뉴 번호를 입력하세요 : ");
		return Input.inputInt(4);
	}
	
	public static int userMenu(int number) {
		System.out.println();
		System.out.println(number + " 번째 고객");
		System.out.println("============================");
		System.out.println("1. 이름");
		System.out.println("2. 나이");
		System.out.println("3. 성별");
		System.out.println("4. 지역");
		System.out.println("5. 온라인 사용 시간");
		System.out.println("6. 뒤로 가기");
		System.out.println("============================");
		return Input.inputInt(6);
	}
	
	public static int userInGroupSettingMenu() {
		System.out.println();
		System.out.println("============================");
		System.out.println("1. 최저 나이와 최대 나이");
		System.out.println("2. 성별");
		System.out.println("3. 지역");
		System.out.println("4. 온라인 사용 시간");
		System.out.println("5. 뒤로 가기");
		System.out.println("============================");
		System.out.print("메뉴 번호를 입력하세요 : ");
		return Input.inputInt(5);
	}
	
	public static int minAgeInGroupMenu() {
		System.out.print("최저 나이를 입력하세요 : ");
		return Input.inputInt(100);
	}
	
	public static int maxAgeInGroupMenu() {
		System.out.print("최대 나이를 입력하세요 : ");
		return Input.inputInt(100);
	}
	
	public static String genderMenu() {
		System.out.print("성별을 입력하세요 : ");
		return Input.inputGenter();
	}
	
	public static String locationMenu() {
		System.out.print("지역을 입력하세요 : ");
		return Input.inputLocation();
	}
	
	public static int timeMenu() {
		System.out.print("온라인 사용 시간을 입력하세요 : ");
		return Input.inputInt(23);
	}
	
	public static int numOfUserMenu() {
		System.out.print("고객의 수를 입력하세요 (-1 : 뒤로 가기) : ");
		return Input.inputInt(Integer.MAX_VALUE);
	}

	public static void cusName() {
		System.out.print("고객의 이름을 입력하세요 : ");
	}

	public static void cusAge() {
		System.out.print("고객의 나이를 입력하세요 : ");
	}

	public static void cusGender() {
		System.out.print("고객의 성별을 입력하세요 : ");
	}

	public static void cusLocation() {
		System.out.print("고객의 지역을 입력하세요 : ");
	}

	public static void cusOnline() {
		System.out.print("고객의 온라인 사용 시간을 입력하세요 : ");
	}
}
