package bai4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so benh nhan");
        int n=sc.nextInt();
        sc.nextLine();
        BenhNhan a[]=new BenhNhan[n];
        for (int i=0;i<n;i++) {

        // Tạo đối tượng BenhNhan
        a[i] = new BenhNhan();

        // Nhập thông tin cho BenhNhan
        System.out.println("Nhập thông tin bệnh nhân:");
        a[i].nhapThongTin(sc);

        // Hiển thị thông tin bệnh nhân
        System.out.println("\nThông tin bệnh nhân:");
        System.out.println(a[i]);
        }
        sc.close();// Đóng Scanner sau khi sử dụng
        //ktra setter getter
        a[0].setTen("Le Duc Tuong");System.out.println(a[0].getTen());
    }
}
