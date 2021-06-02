package entity;

public class User {
	private int age; // 나이
	private String gender; // 성별
	private String location; // 지역
	private int time; // 온라인 이용 시간 (시간 단위)
	
	User(int age, String gender, String location, int time) {
		this.age = age;
		this.gender = gender;
		this.location = location;
		this.time = time;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
}
