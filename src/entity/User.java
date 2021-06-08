package entity;
import util.Generator;

public class User {
	private int id; // 고유 번호
	private int age; // 나이
	private String gender; // 성별
	private String location; // 지역
	private int time; // 온라인 이용 시간 (시간 단위)
	
	public User() {
		this(0, "", "", 0);	// age, gender, location, time 틀 설정
	}
	
	User(int age, String gender, String location, int time) {
		this.id = Generator.getId();	
		// User 클래스 내에서 선언한 변수 id에
		// common 폴더 => util 패키지 => Generator 클래스에서 구현한 id 발생기에서 증가한 값을 사용
		this.age = age;
		this.gender = gender;
		this.location = location;
		this.time = time;
	}
	
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getLocation() {
		return location;
	}
	public int getTime() {
		return time;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	public void showUser() {
		String user = String.format("id: %d, age: %d, gender: %s, location: %s, time: %d",
				id, age, gender, location, time);	
		// user 라는 변수 내에 유저 정보를 입력한 값을 토대로 보여주는(View) 틀 설정
		System.out.println(user);	// user 출력
	}
}
