import java.text.NumberFormat;

public class Rectangle {

	private double length;
	private double width;

	Rectangle() {
		length = 0.0;
		width = 0.0;
	}

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public double getArea() {
		double area = length * width;
		return area;
	}

	public double getPermiter() {
		double perimeter = 2 * width + 2 * length;
		return perimeter;
	}

	public String getAreaFormatted() {
		double area = getArea();
		NumberFormat numberFormatter = NumberFormat.getNumberInstance();
		numberFormatter.setMaximumFractionDigits(3);
		String formatted = numberFormatter.format(area);
		return formatted;
	}

	public String getPermiterFormatted() {
		double perimeter = getPermiter();
		NumberFormat numberFormatter = NumberFormat.getNumberInstance();
		numberFormatter.setMaximumFractionDigits(3);
		String formatted = numberFormatter.format(perimeter);
		return formatted;
	}
}
