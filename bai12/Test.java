package bai12;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Nguoi a;
		System.out.println("nhap loai sinh vien: 1-SVCDN,2-SVCDCQ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==1) {
			a=new SVCDN();
			a.nhap();
			a.in();
		}
		else {
			a=new SVCDCQ();
			a.nhap();
			a.in();
		}
	}
}
