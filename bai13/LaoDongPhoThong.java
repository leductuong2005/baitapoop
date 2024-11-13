package bai13;

import java.util.Scanner;

public class LaoDongPhoThong extends NguoiLaoDong{
	private int soNgayCong;
	private double dGiaNC;
	public LaoDongPhoThong() {
		super("","","Lao dong pho thong");
	}
	public LaoDongPhoThong(String hoTen, String diaChi, String loaiLD,int soNgayCong, double dGiaNC) {
		super(hoTen, diaChi,"lao dong pho thong");
		this.soNgayCong = soNgayCong;
		this.dGiaNC = dGiaNC;
	}
	@Override
	public void nhap() {
		super.nhap();
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so ngay cong");
		soNgayCong=sc.nextInt();
		sc.nextLine();
		System.out.println("nhap dgia ngay cong");
		dGiaNC=sc.nextDouble();
		sc.nextLine();
	}
	@Override
	public double tinhLuong() {
		if(soNgayCong>=25)return soNgayCong*dGiaNC+1000000;
		else if(soNgayCong<25 &&soNgayCong>15)return soNgayCong*dGiaNC+700000;
		return soNgayCong*dGiaNC;
	}
}
