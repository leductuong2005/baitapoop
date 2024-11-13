package bai2;

public class Test {
	public static void main(String[] args) {
		DiaChi a=new DiaChi("xom 3 ","Giao Tien","Giao Thuy","Nam Dinh");
		System.out.println(a);
		//ktra getter setter
		a.setThon("xom 4");System.out.println(a.getThon());
		a.setXa("Giao Yen");System.out.println(a.getXa());
		a.setHuyen("Gi Cha Duoc");System.out.println(a.getHuyen());
		a.setTinh("Binh Duong");System.out.println(a.getTinh());
	}
}
