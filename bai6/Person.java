package bai6;

public abstract class Person {
	protected String name;
	protected int age;
	protected char gender;
	public Person() {
	}
	public Person(String name, int age , char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ten: "+this.name+"\n"+"tuoi: "+this.age+"\n"+"gioi tinh: "+this.gender+"\n";
	}
	public abstract void nhapThongTin();
	
}