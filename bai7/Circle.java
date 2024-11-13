package bai7;

public class Circle implements GeometricObject{
	protected double radius=1.0;
	public Circle() {
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	//dinh nghia phuong thuc
	@Override
	public double getPerimeter() {
		return 2*3.14*radius;
	}
	@Override
	public double getArea() {
		return 3.14*radius*radius;
	}
}
