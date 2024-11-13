package bai4;

import java.util.Scanner;

public class BenhVien {
	//thuoc tinh
	private String tenBV,diaChi,giamDoc;
	//constructor k doi
	public BenhVien() {
		this.tenBV="No Name";
		this.diaChi="No Known";
		this.giamDoc="No Known";
		
	}
	//consr=tructor day du 
	public BenhVien(String tenBV,String diaChi,String giamDoc) {
		this.tenBV=tenBV;
		this.diaChi=diaChi;
		this.giamDoc=giamDoc;
	}
	//setter
	public void setTenBV(String tenBV) {
		this.tenBV=tenBV;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi=diaChi;
	}
	public void setGiamDoc(String giamDoc) {
		this.giamDoc=giamDoc;
	}
	//getter
	public String getTenBV() {
		return this.tenBV;
	}public String getDiaChi() {
		return this.diaChi;
	}public String getGiamDoc() {
		return this.giamDoc;
	}
	//nhap thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.println("nhap ten benh vien : ");
		this.tenBV=sc.nextLine();
		System.out.println("nhap dia chi : ");
		this.diaChi=sc.nextLine();
		System.out.println("nhap giam doc : ");
		this.giamDoc=sc.nextLine();
	}
	public String toString() {
		return "ten benh vien : "+this.tenBV+"\n"+"dia chi:  "+this.diaChi+"\n"+"giam doc :  "+this.giamDoc+"\n";
	}
}
	
	
	
	