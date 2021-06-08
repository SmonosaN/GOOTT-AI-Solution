package entity;

import java.util.ArrayList;

public abstract class Group {
	protected int minAge; // �ּ� ����
	protected int maxAge; // �ִ� ����
	protected String gender; // ����
	protected String location; // ����
	protected int time; // �̿� �ð�
	protected ArrayList<User> userList; // User Ŭ���� => �׷��� �� ����Ʈ
	
	Group(int minAge, int maxAge, String gender, String location, int time) {
		this.minAge = minAge;
		this.maxAge = maxAge;
		this.gender = gender;
		this.location = location;
		this.time = time;
		this.userList = new ArrayList<User>();
	}

	public void setMinAge(int minAge) {
		if (minAge < maxAge) this.minAge = minAge;
	}
	public void setMaxAge(int maxAge) {
		if (minAge < maxAge) this.maxAge = maxAge;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public ArrayList<User> getUserList() {
		return userList;
	}
	public int getMinAge() {
		return minAge;
	}
	public int getMaxAge() {
		return maxAge;
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
	public void setTime(int time) {
		this.time = time;
	}

	abstract public void showUserList();

	abstract public void showGroup();
}
