package bai5;

public class Truong {
	//cac thuoc tinh
	private String ten,diaChi,hieuTruong;
	public Truong() {//contructor ktham so
	}
	//contructor co tham so
	public Truong(String ten, String diaChi, String hieuTruong) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.hieuTruong = hieuTruong;
	}
	//setter getter
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getHieuTruong() {
		return hieuTruong;
	}
	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}
	//toString
	@Override
	public String toString() {
		return "Truong [ten=" + ten + ", diaChi=" + diaChi + ", hieuTruong=" + hieuTruong + "]";
	}
	
	
}
