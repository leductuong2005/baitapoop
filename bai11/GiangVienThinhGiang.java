package bai11;

import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien {
    private int soTietDay=10;
    private double donGia=500000;

    public GiangVienThinhGiang() {
        super("", "", "Giảng viên thỉnh giảng");
    }
    public GiangVienThinhGiang(String hoTen, String diaChi, int soTietDay, double donGia) {
        super(hoTen, diaChi, "Giảng viên thỉnh giảng");
        this.soTietDay = soTietDay;
        this.donGia = donGia;
    }

    @Override
    public void nhapThongTin() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("nhap ten giang vien");
    	this.hoTen=sc.nextLine();
    	System.out.println("nhap dia chi");
    	this.diaChi=sc.nextLine();
    }

    @Override
    public double tinhLuong() {
        return soTietDay * donGia * 0.85; // 15% Thu nhập
    }
}