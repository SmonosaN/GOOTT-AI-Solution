package entity;

import java.util.ArrayList;

public abstract class Group {
	protected int minAge; // 최소 나이
	protected int maxAge; // 최대 나이
	protected String gender; // 성별
	protected String location; // 지역
	protected int time; // 이용 시간
	protected ArrayList<User> userList; // 그룹의 고객 리스트
	
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
