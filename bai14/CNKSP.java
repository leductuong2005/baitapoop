package bai14;

import java.util.Scanner;

public class CNKSP extends CongNhan{
	private int soSP;
	private double dGia;
	public CNKSP() {
		super("","","","CNKSP");
	}
	public CNKSP(String hoTen, String diaChi, String ngaySinh, String loaiCN,int soSP, double dGia) {
		super(hoTen, diaChi, ngaySinh, loaiCN);
		this.soSP = soSP;
		this.dGia = dGia;
	}
	@Override
	public void nhap() {
		super.nhap();
		Scanner s=new Scanner(System.in);
		System.out.println("nhap so san pham");
		soSP=s.nextInt();
		s.nextLine();
		System.out.println("nhap don gia san pham ");
		dGia=s.nextDouble();
		s.nextLine();
	}
	@Override
	public double tinhLuong() {
		if(soSP>150)return soSP*dGia+1500000;
		else if (soSP<150&&soSP>100)return dGia*soSP+1000000;
		return soSP*dGia;
	}
	
}
