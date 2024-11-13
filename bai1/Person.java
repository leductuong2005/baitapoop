package bai1;

public class Person {
	//cac thuoc tinh
	private String name;
	private String dob;//ngay sinh
	private String pod;//noi sinh
	private char gender;//m la nam , f la nu
	private String email;
	private String phone;
	//contructor k tham so
	public Person() {
	}
//	contructor co tham so
	public Person(String name, String dob, String pod, char gender, String email, String phone) {
		this.name = name;
		this.dob = dob;
		this.pod = pod;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPod() {
		return pod;
	}
	public void setPod(String pod) {
		this.pod = pod;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", pod=" + pod + ", gender=" + gender + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
	
}
