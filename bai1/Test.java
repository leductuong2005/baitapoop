package bai1;

public class Test {
	public static void main(String[] args) {
		Person a=new Person("le duc tuong","29/10/2005","Nam Dinh",'M',"leductuong29102005@gmail.com","0869048808");
		System.out.println(a);
		//ktra getter setter
		a.setName("LE DUC TUONG");System.out.println(a.getName());
		a.setDob("2005");System.out.println(a.getDob());
		a.setPod("Viet Nam");System.out.println(a.getPod());
		a.setGender('F');System.out.println(a.getGender());
		a.setEmail("leductuong@gmail.com");System.out.println(a.getEmail());
		a.setPhone("012345678");System.out.println(a.getPhone());
		
		
	}

}
