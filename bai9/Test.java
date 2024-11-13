package bai9;

import bai8.Shape;
import bai8.Rectangle;
import bai8.Triangle;

public class Test {
	public static void main(String[] args) {
		Shape a[] = new Shape[5];
		a[0] = new Rectangle("xanh",2, 10);
		a[1] = new Rectangle("do",3, 10);
		a[2] = new Rectangle("tim",4, 10);
		a[3] = new Triangle("vang",2, 3);
		for(Shape s: a) {
			if(s instanceof Rectangle)
			{
				System.out.println(s);
				System.out.println(s.getArea());
			}
		}
		

	}

}
