package bai6;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
	private int hoursPerWeek;
	private int luongPT;
	public PartTimeEmployee() {
		super();
	}
	@Override
	public String toString() {
		return super.toString()+ "PartTimeEmpolyee [hoursPerWeek=" + hoursPerWeek + ", luongPT=" + luongPT + "]";
	}
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	public int getLuongPT() {
		return luongPT;
	}
	public void setLuongPT(int luongPT) {
		this.luongPT = luongPT;
	}
	public PartTimeEmployee(String name, int age, char gender,String eName,String maNV,String dateHire,int luong,int hoursPerWeek,int luongPT) {
		super(name,age,gender,eName,maNV,dateHire,luong);
		this.hoursPerWeek=hoursPerWeek;
		this.luongPT=luongPT;
	}
	
	@Override
	public void nhapThongTin() {
		Scanner sc=new Scanner (System.in);
		super.nhapThongTin();
		System.out.println("nhap tgian lam them");
		this.hoursPerWeek=sc.nextInt();
		sc.nextLine();
		System.out.println("nhap luong lam them");
		this.luongPT=sc.nextInt();
		sc.nextLine();
		
	}
	
	
}
