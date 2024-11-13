package bai11;

import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien {
	private double luongCoBan = 5000000;
	private double heSoLuong=1;
	private int thamNien; // số năm công tác

	public GiangVienCoHuu() {
		super("", "", "Giang Vien Co Huu");
	}

	public GiangVienCoHuu(String hoTen, String diaChi, double luongCoBan, double heSoLuong, int thamNien) {
		super(hoTen, diaChi, "Giảng viên cơ hữu");
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.thamNien = thamNien;
	}

	@Override
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten giang vien");
		this.hoTen = sc.nextLine();
		System.out.println("nhap dia chi");
		this.diaChi = sc.nextLine();
		System.out.println("nhap tham nien cong tac");
		this.thamNien = sc.nextInt();
		sc.nextLine();
	}

	@Override
	public double tinhLuong() {
		if (thamNien>5)
			return luongCoBan * heSoLuong +luongCoBan*(thamNien/100.0);
		return luongCoBan * heSoLuong ;	

	}
}
