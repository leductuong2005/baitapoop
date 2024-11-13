package bai12;

import java.util.Scanner;

public class SVCDN extends Nguoi{
	private double tDKT;
	private int sMKT;
	public SVCDN() {
		super("","","","SVCDN");
	}
	public SVCDN(String hoTen, String ngaySinh, String diaChi, String loaiSV,double tDKT,int sMKT) {
		super(hoTen, ngaySinh, diaChi, "SVCDN");
		this.tDKT=tDKT;
		this.sMKT=sMKT;
	}
	@Override
	public void nhap() {
		super.nhap();
		Scanner s=new Scanner(System.in);
		System.out.println("nhap tong diem kiem tra");
		tDKT=s.nextDouble();
		s.nextLine();
		System.out.println("nhap so mon kiem tra");
		sMKT=s.nextInt();
		s.nextLine();
	}
	@Override
	public double tinhDiem() {
		return tDKT/sMKT;
	}
}
