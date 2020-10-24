package prs.ui;

import java.util.List;

import prs.business.Product;
import prs.db.ProductDb;

public class PrsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("COMMANDS");
		System.out.println("prod-list - List all products");
		System.out.println("prod-add - add a product");
		System.out.println("prod-delete - Delete a product");
		System.out.println("prod-update - update product");
		System.out.println("exit - Exit the application");
		System.out.println();

		ProductDb product = new ProductDb();

		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			command = Console.getString("Enter command");

			switch (command.toLowerCase()) {
			case "prod-add":
				addProduct(product);
				break;
			case "prod-list":
				listProducts();
				break;
			case "prod-delete":
				deleteProduct();
				break;
			case "prod-update":
				updateProduct(product);
				break;
			case "exit":
				// do something
				break;
			default:
				System.out.println("Invalid command");
				break;
			}
		}

	}

	private static void listProducts() {
		ProductDb productDb = new ProductDb();
		List<Product> products = productDb.getAll();
		System.out.println("Products:");
		for (Product product : products) {
			System.out.println(product);
		}
		System.out.println();
	}

	private static void deleteProduct() {
		ProductDb product = new ProductDb();
		int deleteId = Console.getInt("Product Id to delete");
		if (product.delete(deleteId)) {
			System.out.print("deleted successfully");
			System.out.println();
		} else {
			System.out.print("something went wrong");
		}
	}

	private static void updateProduct(ProductDb product) {
		int productId = Console.getInt("Product Id to update");
		int vendorId = Console.getInt("Vendor Id to update");
		String partNumber = Console.getString("PartNumber to update");
		String name = Console.getString("Name to update");
		Double price = Console.getDouble("Price to update");
		String unit = Console.getString("Unit to update");
		String photoPath = Console.getString("PhotoPath to update");

		Product productUpdate = new Product(productId, vendorId, partNumber, name, price, unit, photoPath);
		if (product.update(productUpdate)) {
			System.out.print("updated successfully");
			System.out.println();
		} else {
			System.out.print("something went wrong");
		}
	}

	private static void addProduct(ProductDb product) {
		int vendorId = Console.getInt("Vendor Id to update");
		String partNumber = Console.getString("PartNumber to update");
		String name = Console.getString("Name to update");
		Double price = Console.getDouble("Price to update");
		String unit = Console.getString("Unit to update");
		String photoPath = Console.getString("PhotoPath to update");

		Product productAdd = new Product(0, vendorId, partNumber, name, price, unit, photoPath);
		if (product.add(productAdd)) {
			System.out.print("added successfully");
			System.out.println();
		} else {
			System.out.print("something went wrong");
		}

	}

}
