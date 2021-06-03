package entity;

import java.util.ArrayList;

public abstract class Group {
	protected int minAge; // �ּ� ����
	protected int maxAge; // �ִ� ����
	protected String gender; // ����
	protected String location; // ����
	protected int time; // �̿� �ð�
	protected ArrayList<User> userList; // �׷��� �� ����Ʈ
	
	Group(int minAge, int maxAge, String gender, String location, int time) {
		this.minAge = minAge;
		this.maxAge = maxAge;
		this.gender = gender;
		this.location = location;
		this.time = time;
	}


	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
    abstract public void showUserList();
	
	abstract public void showGroup();
}
