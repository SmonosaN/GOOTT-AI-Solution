package ui;

public class UI {
	static void showMainUI() {}
	
	public static void information() {
		System.out.println("============================");
		System.out.println("Title: Customer Segmentation");
		System.out.println("Developers : 노성민, 임태호");
		System.out.println("Email : bbaktaeho@kakao.com");
		System.out.println("============================");
	}

	public static int mainMenu() {
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
		System.out.println("그룹을 입력하세요 : ");
		return Input.inputString();
	}
	
	public static int groupSettingMenu() {
		System.out.println("============================");
		System.out.println("1. 그룹별 고객 정보 설정 및 수정");
		System.out.println("2. 그룹별 고객 정보 조회");
		System.out.println("3. 종료");
		System.out.println("============================");
		System.out.print("메뉴 번호를 입력하세요 : ");
		return Input.inputInt(3);
	}

	public static int userSettingMenu() {
		System.out.println("============================");
		System.out.println("고객의 정보를 입력합니다.");
		System.out.println("1. 이름");
		System.out.println("2. 나이");
		System.out.println("3. 성별");
		System.out.println("4. 지역");
		System.out.println("5. 온라인 사용 시간");
		System.out.println("6. 뒤로 가기");
		System.out.println("============================");
		return Input.inputInt(6);
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
	
	public static void aGroup() {
		System.out.println("A그룹 입니다.");
	}

	public static void bGroup() {
		System.out.println("B그룹 입니다.");
	}

	public static void cGroup() {
		System.out.println("C그룹 입니다.");
	}
	
	public static void errGroup() {
		System.out.println("그룹을 불러올 수 없습니다.");
		System.out.println("고객의 정보를 먼저 입력해주세요.");
	}

	public static void insertInfor() {
		System.out.println("============================");
		System.out.println("고객의 정보를 수정합니다.");
		System.out.print("수정할 고객을 선택하세요 : ");
		System.out.println("0. 뒤로 가기");
		System.out.println("============================");
	}
}
