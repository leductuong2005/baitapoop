package bai10;

import java.util.Scanner;

public abstract class HocVien {
	protected String hoTen,diaChi,loaiCT;
	protected int loaiUT;
	public HocVien() {
	}
	
	public HocVien(String hoTen, String diaChi, String loaiCT, int loaiUT) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiCT = loaiCT;
		this.loaiUT = loaiUT;
	}

	public void nhapThongTin()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap ten hoc vien");
		hoTen=sc.nextLine();
		System.out.println("nhap dia chi");
		diaChi=sc.nextLine();
		System.out.println("nhap loai uu tien");
		loaiUT=sc.nextInt();
	}
	public abstract long hocPhi();
	public String toString() {
		return "ho ten : "+hoTen+"\n"+
				"dia chi : "+diaChi+"\n"+
				"loai uu tien : "+loaiUT+"\n";
	}
	
	
}
