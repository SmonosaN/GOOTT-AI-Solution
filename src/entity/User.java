package entity;

public class User {
	private int age; // ����
	private String gender; // ����
	private String location; // ����
	private int time; // �¶��� �̿� �ð� (�ð� ����)
	
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
