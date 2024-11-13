package bai13;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		NguoiLaoDong a;
		System.out.println("nhap loai lao dong:1-lao dong pho thong,2-ki su");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1) {
			a=new LaoDongPhoThong();
			a.nhap();
			a.in();
		}
		else {
			a=new KiSu();
			a.nhap();
			a.in();
		}
	}
}
