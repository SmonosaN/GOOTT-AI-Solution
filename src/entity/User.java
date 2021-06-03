package entity;
import util.Generator;

public class User {
	private int id; // 고유 번호
	private int age; // 나이
	private String gender; // 성별
	private String location; // 지역
	private int time; // 온라인 이용 시간 (시간 단위)
	
	User(int age, String gender, String location, int time) {
		this.id = Generator.getId();
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
		System.out.println(user);
	}
}
