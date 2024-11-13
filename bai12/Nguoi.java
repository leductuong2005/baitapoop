package bai12;

import java.util.Scanner;

public abstract class Nguoi {
	protected String hoTen,ngaySinh,diaChi;
	protected String loaiSV;
	public Nguoi() {
	}
	public Nguoi(String hoTen, String ngaySinh, String diaChi, String loaiSV) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.loaiSV=loaiSV;
	}
	public void nhap() {
		Scanner s=new Scanner(System.in);
		System.out.println("nhap ten sinh vien ");
		hoTen=s.nextLine();
		System.out.println("nhap dia chi sinh vien ");
		diaChi=s.nextLine();
		System.out.println("nhap ngay sinh sinh vien");
		ngaySinh=s.nextLine();
	}
	public abstract double tinhDiem();
	public void in() {
		System.out.println("ho ten: "+hoTen);
		System.out.println("dia chi: "+diaChi );
		System.out.println("ngay sinh: "+ngaySinh);
		System.out.println("loai sinh vien: "+loaiSV);
		System.out.println("diem trung binh: "+tinhDiem());
	}
	
}
