package bai5;

public class SinhVien extends Nguoi{
	//thuoc tinh
	private String lop, nganh;
	private Truong truong;
	//contructor k tham so
	public SinhVien() {
		super();
	}
	//contructor du tham so
	public SinhVien(String ten, int tuoi, char gioiTinh, String lop, String nganh, Truong truong) {
		super(ten, tuoi, gioiTinh);
		this.lop = lop;
		this.nganh = nganh;
		this.truong = truong;
	}
	//setter getter
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public Truong getTruong() {
		return truong;
	}
	public void setTruong(Truong truong) {
		this.truong = truong;
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+"\nSinhVien [lop=" + lop + ", nganh=" + nganh + ", truong=" + truong + "]";
	}
	
	
}
