public class ProductDB {

	public static Product getProduct(String productCode) {
		// In a more realistic application, this code would
		// get the data for the product from a file or database
		// For now, this code just uses if/else statements
		// to return the correct product data

		// create the Product object

		// create the Product object with with your constructor that sets params
		Product product2 = new Product(productCode, "Murach's Java Servlets and JSP", 57.50);
		Product product3 = new Product(productCode, "Murach's MySQL", 54.50);
		Product product4 = new Product(productCode, "Murach's python", 57.50);
		Product product5 = new Product(productCode, "Murach's Java Programming", 57.50);

		// you can also call product, and then pass in like so
		Product product6;
		if (productCode.equalsIgnoreCase("java")) {
			product6 = new Product(productCode, "Murach's Java Servlets and JSP", 57.50);
		}

		// create the Product object
		// then with your product instance you can call the methods to set your values
		Product product = new Product();
		// fill the Product object with data
		product.setCode(productCode);
		if (productCode.equalsIgnoreCase("java")) {
			product.setDescription("Murach's Java Programming");
			product.setPrice(57.50);
		} else if (productCode.equalsIgnoreCase("jsp")) {
			product.setDescription("Murach's Java Servlets and JSP");
			product.setPrice(57.50);
		} else if (productCode.equalsIgnoreCase("mysql")) {
			product.setDescription("Murach's MySQL");
			product.setPrice(54.50);
		} else if (productCode.equalsIgnoreCase("python")) {
			product.setDescription("Murach's python");
			product.setPrice(66.60);
		} else {
			product.setDescription("Unknown");
		}
		return product;
	}
}