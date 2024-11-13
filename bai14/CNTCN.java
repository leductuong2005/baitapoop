package bai14;

import java.util.Scanner;

public class CNTCN extends CongNhan {
	private double luongCoBan,heSoLuong;
	private int soNgayCong;
	public CNTCN() {
		super("","","","CNTCN");
	}

	public CNTCN(String hoTen, String diaChi, String ngaySinh, String loaiCN,double luongCoBan, double heSoLuong, int soNgayCong) {
		super(hoTen, diaChi, ngaySinh, "CNTCN");
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.soNgayCong = soNgayCong;
	}
	@Override
	public void nhap() {
		super.nhap();
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap luong co ban ");
		luongCoBan=sc.nextDouble();
		sc.nextLine();
		System.out.println("nhap he so luong");
		heSoLuong=sc.nextDouble();
		sc.nextLine();
		System.out.println("nhap so ngay cong");
		soNgayCong=sc.nextInt();
		sc.nextLine();
	}

	@Override
	public double tinhLuong() {
		if(soNgayCong>=20)return luongCoBan*heSoLuong+luongCoBan*1.2;
		return luongCoBan*heSoLuong;
	}
	
}
