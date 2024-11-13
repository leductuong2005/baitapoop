package bai12;

import java.util.Scanner;

public class SVCDCQ extends Nguoi{
	private double tDKT,dTKTHP;
	private int sMKT;
	public SVCDCQ() {
		super("","","","SVCDCQ");
	}
	public SVCDCQ(String hoTen, String ngaySinh, String diaChi, String loaiSV,double tDKT,int sMKT,double dTKTHP) {
		super(hoTen, ngaySinh, diaChi, "SVCDN");
		this.tDKT=tDKT;
		this.sMKT=sMKT;
		this.dTKTHP=dTKTHP;
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
		System.out.println("nhap diem thi ket thuc hoc phan ");
		dTKTHP=s.nextDouble();
		s.nextLine();
	}
	@Override
	public double tinhDiem() {
		return (tDKT/sMKT+dTKTHP)/3;
	}
}