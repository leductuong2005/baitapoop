package bai13;

import java.util.Scanner;

public abstract class NguoiLaoDong {
	protected String hoTen,diaChi,loaiLD;
	public NguoiLaoDong() {
	}
	public NguoiLaoDong(String hoTen, String diaChi, String loaiLD) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiLD = loaiLD;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap ho ten nguoi lao dong");
		hoTen=sc.nextLine();
		System.out.println("nhap dia chi nguoi lao dong");
		diaChi=sc.nextLine();
	}
	public abstract double tinhLuong();
	public void in() {
		System.out.println("ten lao dong: "+hoTen);
		System.out.println("dia chi: "+diaChi);
		System.out.println("loai lao dong "+loaiLD);
		System.out.println("luong: "+tinhLuong());
	}
}
