package bai7;

public class ResizableCircle extends Circle implements Resizable {
	public ResizableCircle() {
		super();
	}

	public ResizableCircle(double radius) {
		super(radius);
	}
	@Override
	public void resize(int percent) throws BatLoi{
		if(percent <0) {
			throw new BatLoi("pham tram phai lon hon 0!");
		}
		radius=percent*radius/100;
	}
	
}
