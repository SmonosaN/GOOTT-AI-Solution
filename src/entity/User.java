package entity;
import util.Generator;

public class User {
	private int id; // ���� ��ȣ
	private int age; // ����
	private String gender; // ����
	private String location; // ����
	private int time; // �¶��� �̿� �ð� (�ð� ����)
	
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
