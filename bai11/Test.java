package bai11;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap 2 loai giang vien");
		for (int i = 0; i < 2; i++) {
			System.out.print("Nhập loại giảng viên (1 - Thỉnh giảng, 2 - Cơ hữu): ");
			int loaiGV = scanner.nextInt();
			scanner.nextLine();
			GiangVien a;// ???

			if (loaiGV == 1) {
				a = new GiangVienThinhGiang();
			} else {
				a = new GiangVienCoHuu();
			}

			// Nhập thông tin cho giảng viên
			a.nhapThongTin();

			// In thông tin giảng viên
			a.inThongTin();

		}
		scanner.close();
	}

}
