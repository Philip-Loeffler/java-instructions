package prs.Crud;

import prs.business.Product;
import prs.db.ProductDb;
import prs.db.VendorDb;
import prs.ui.Console;

public class VendorOperations {

	VendorDb vendor = new VendorDb();

//	public static void listVendor() {
//		VendorDb vendorDb = new VendorDb();
//		List<Vendor> vendors = VendorDb.getAll();
//		System.out.println("Products:");
//		for (Vendor vendor : vendors) {
//			System.out.println(vendor);
//		}
//		System.out.println();
//	}

	public static void deleteProduct() {
		ProductDb product = new ProductDb();
		int deleteId = Console.getInt("Product Id to delete");
		if (product.delete(deleteId)) {
			System.out.print("deleted successfully");
			System.out.println();
		} else {
			System.out.print("something went wrong");
		}
	}

	public static void updateProduct(ProductDb product) {
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

	public static void addProduct(ProductDb product) {
		int vendorId = Console.getInt("vendorId to update");
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
