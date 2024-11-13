package bai14;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		CongNhan a;
		System.out.println("nhap vao loai cong nhan: 1-CNKSP,2-CNTCN");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1) {
			a=new CNKSP();
			a.nhap();
			a.in();
		}
		else {
			a=new CNTCN();
			a.nhap();
			a.in();
		}
	}
}
