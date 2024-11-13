package bai3;

public class NhanVien {
	//cac thuoc tinh
	private String name,doc;
	private char gender;
	private DiaChi address;// quan he ket tap
	//contructor k tham so
	public NhanVien() {}
	//contructor du tham so
	public NhanVien(String name, String doc, char gender, DiaChi address) {
		this.name = name;
		this.doc = doc;
		this.gender = gender;
		this.address = address;
	}
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public DiaChi getAddress() {
		return address;
	}
	public void setAddress(DiaChi address) {
		this.address = address;
	}
	//toString
	@Override
	public String toString() {
		return "NhanVien [name=" + name + ", doc=" + doc + ", gender=" + gender + ", address=" + address + "]";
	}
	
}
