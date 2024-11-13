package bai7;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ResizableCircle b = new ResizableCircle(2.0);
		System.out.println(b.getPerimeter());
		System.out.println(b.getArea());
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao pham tram kich thuoc hinh tron moi");
		int n = sc.nextInt();
		sc.nextLine();
		try {
			b.resize(n);
			System.out.println(b.getPerimeter());
			System.out.println(b.getArea());
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
