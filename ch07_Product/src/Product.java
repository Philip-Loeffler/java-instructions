import java.text.NumberFormat;

public class Product {

	// fields, member variables, instance variables
	private String code;
	private String description;
	private double price;

	// constructor that you dont pass arguements into when you create the instance
	// object
	public Product() {
		code = "";
		description = "";
		price = 0;
	}

	// this is another constructor, that you pass the value into
	public Product(String code, String description, double price) {
		code = code;
		description = description;
		price = price;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public String getPriceFormatted() {
		NumberFormat currency = NumberFormat.getNumberInstance();
		return currency.format(price);
	}

	public String getPriceNumberFormatted() {
		NumberFormat numberFormatter = NumberFormat.getNumberInstance();
		numberFormatter.setMaximumFractionDigits(2);
		String formatted = numberFormatter.format(price);
		return formatted;
	}
}