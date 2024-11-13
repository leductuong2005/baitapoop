package bai5;

public class Test {
	public static void main(String[] args) {
		Truong a=new Truong("HAUI","Nhon","ko bit");
		SinhVien b=new SinhVien("le duc tuong", 19, 'M', "Cntt01", "cntt", a);
		System.out.println(b);
		//ktra setter getter
		a.setTen("Neu");System.out.println(b.getTruong());
	}
}
