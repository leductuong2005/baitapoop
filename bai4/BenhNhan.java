package bai4;

import java.util.Scanner;

public class BenhNhan extends Nguoi{
	private String tienSu;
	private String chuanDoan;
	private BenhVien benhVien;
	//constructor k doi
	public BenhNhan() {
		super();
	}
	//constructor day du
	public BenhNhan(String ten,int tuoi,char gioiTinh,String tienSu, String chuanDoan,BenhVien benhVien ) {
		super(ten,tuoi,gioiTinh);
		this.tienSu=tienSu;
		this.chuanDoan=chuanDoan;
		this.benhVien=benhVien;
	}
	//setter
	public void setTienSu(String tienSu) {
		this.tienSu=tienSu;
	}
	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan=chuanDoan;
	}
	public void setBV(BenhVien benhVien ){
		this.benhVien=benhVien;
	}
	//getter
	public String getTienSu() {
		return this.tienSu;
	}public String getChuanDoan() {
		return this.chuanDoan;
	}public BenhVien getBV() {
		return this.benhVien;
	}
	//nhap thong tin
	public void nhapThongTin(Scanner sc) {
		//lay thong tin bang cach nhap thong tin vao lop nguoi
		super.nhapThongTin(sc);
		System.out.println("nhap tien su : ");
		this.tienSu=sc.nextLine();
		System.out.println("nhap chuan doan : ");
		this.chuanDoan=sc.nextLine();
		//nhap thong tin tu benh vien
		this.benhVien=new BenhVien();
		this.benhVien.nhapThongTin(sc);
		
	}
	public String toString() {
        return super.toString() + 
               "\nTiền sử: " + tienSu + 
               "\nChẩn đoán: " + chuanDoan + 
               "\nThông tin bệnh viện:\n" + benhVien.toString();
    }
}