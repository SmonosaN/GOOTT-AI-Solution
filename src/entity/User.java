package entity;
import util.Generator;

public class User {
	private int id; // ���� ��ȣ
	private String name; // �̸�
	private int age; // ����
	private String gender; // ����
	private String location; // ����
	private int time; // �¶��� �̿� �ð� (�ð� ����)
	
	public User() {
		this(0, "", "", "", 0);	// age, name, gender, location, time Ʋ ����
	}
	
	User(int age, String name, String gender, String location, int time) {
		this.id = Generator.getId();	
		// User Ŭ���� ������ ������ ���� id��
		// common ���� => util ��Ű�� => Generator Ŭ�������� ������ id �߻��⿡�� ������ ���� ���
		this.age = age;
		this.name = name;
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
	public String getName() {
		return name;
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
	public void setName(String name) {
		this.name = name;
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
		String user = String.format("id: %d, name: %s, age: %d, gender: %s, location: %s, time: %d",
				id, name, age, gender, location, time);	
		// user ��� ���� ���� ���� ������ �Է��� ���� ���� �����ִ�(View) Ʋ ����
		System.out.println(user);	// user ���
	}
}
