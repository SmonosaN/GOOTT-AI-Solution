package entity;

public class Group {
	private int minAge;
	private int maxAge;
	private String gender;
	private String location;
	
	Group(int minAge, int maxAge, String gender, String location) {
		this.minAge = minAge;
		this.maxAge = maxAge;
		this.gender = gender;
		this.location = location;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
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
}
