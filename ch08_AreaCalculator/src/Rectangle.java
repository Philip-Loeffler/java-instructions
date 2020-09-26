
public class Rectangle extends Square {

	public double height;

	public Rectangle(double width, double height) {
		super(width);
		this.height = height;

	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;

	}

	@Override
	public double getArea() {
		return getWidth() * height;
	}

}
