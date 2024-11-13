package bai14;

import java.util.Scanner;

public abstract class CongNhan {
	protected String hoTen,diaChi,ngaySinh,loaiCN;
	public CongNhan() {
	}
	public CongNhan(String hoTen, String diaChi, String ngaySinh, String loaiCN) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		this.loaiCN = loaiCN;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap ho ten cong nhan");
		hoTen=sc.nextLine();
		System.out.println("nhap dia chi cong nhan");
		diaChi=sc.nextLine();
		System.out.println("nhap ngay sinh ");
		ngaySinh=sc.nextLine();
	}
	public abstract double tinhLuong();
	public void in() {
		System.out.println("ho ten: "+hoTen);
		System.out.println("dia chi: "+diaChi);
		System.out.println("ngay sinh: "+ngaySinh);
		System.out.println("loai cong nhan: "+loaiCN);
		System.out.println("luong: "+tinhLuong());
	}
}
