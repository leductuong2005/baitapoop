package bai6;

import java.util.Scanner;

public class Employee extends Person {
    protected String eName, maNV, dateHire;
    protected int luong;

    public Employee() {
        super();
    }

    public Employee(String name, int age, char gender, String eName, String maNV, String dateHire, int luong) {
        super(name, age, gender);
        this.eName = eName;
        this.maNV = maNV;
        this.dateHire = dateHire;
        this.luong = luong;
    }

    public String getDateHire() {
        return dateHire;
    }

    public String geteName() {
        return eName;
    }

    public int getLuong() {
        return luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setDateHire(String dateHire) {
        this.dateHire = dateHire;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        this.name = sc.nextLine();
        System.out.println("Nhap tuoi:");
        this.age = sc.nextInt();
        sc.nextLine();  // Clear the newline character
        System.out.println("Nhap gioi tinh (M=Male, F=Female):");
        String input = sc.nextLine();
        this.gender = input.charAt(0);
        System.out.println("Nhap ten nhan vien:");
        this.eName = sc.nextLine();
        System.out.println("Nhap ma nhan vien:");
        this.maNV = sc.nextLine();
        System.out.println("Nhap ngay thue:");
        this.dateHire = sc.nextLine();
        System.out.println("Nhap luong:");
        this.luong = sc.nextInt();
        sc.nextLine();
       
    }

    @Override
    public String toString() {
        return super.toString() + "tenNV: " + this.eName + "\n" + "maNV: " + this.maNV + "\n" +
               "ngay thue: " + this.dateHire + "\n" + "luong: " + this.luong + "\n";
    }
    
}
