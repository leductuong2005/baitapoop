package bai3;

public class Test {
	public static void main(String[] args) {
		DiaChi add=new DiaChi("xom 3 ","Giao Tien","Giao Thuy","Nam Dinh");
		DiaChi add1=new DiaChi("xom 4 ","Giao Tien","Giao Thuy","Nam Dinh");
		NhanVien b=new NhanVien("le duc tuong", "29/10/2005",'M',add);
		System.out.println(b);
		//ktra getter setter
		b.setName("le duc phu");System.out.println(b.getName());
		b.setDoc("25/10/2003");System.out.println(b.getDoc());
		b.setGender('F');System.out.println(b.getGender());
		b.setAddress(add1);System.out.println(b.getAddress());
	}

}
