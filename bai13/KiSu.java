package bai13;

import java.util.Scanner;

public class KiSu extends NguoiLaoDong{
	private double luongCoBan,heSoLuong;
	private int soNgayCong;
	public KiSu() {
		super("","","ki su");
	}
	public KiSu(String hoTen, String diaChi, String loaiLD,double luongCoBan, double heSoLuong,int soNgayCong) {
		super(hoTen, diaChi,"ki su");
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.soNgayCong=soNgayCong;
	}
	@Override
	public void nhap() {
		super.nhap();
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap luong co ban");
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
		if(soNgayCong>=25)return luongCoBan*heSoLuong+2000000;
		else if(soNgayCong<25 &&soNgayCong>15)return luongCoBan*heSoLuong+1000000;
		return  luongCoBan*heSoLuong+500000;
	}
}
