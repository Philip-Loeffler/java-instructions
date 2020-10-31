package prs.ui;

import prs.Crud.ProductOperations;
import prs.Crud.UserOperations;
import prs.business.User;
import prs.db.ProductDb;

public class PrsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("COMMANDS");
		System.out.println("login - login");
		System.out.println("prod-list - List all products");
		System.out.println("prod-add - add a product");
		System.out.println("prod-delete - Delete a product");
		System.out.println("prod-update - update product");
		System.out.println("exit - Exit the application");
		System.out.println();

		ProductDb product = new ProductDb();

		User authenticatedUser = null;

		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			command = Console.getString("Enter command");

			if (command.equalsIgnoreCase("login")) {
				authenticatedUser = UserOperations.login();

				if (authenticatedUser == null) {
					System.out.println("userName/password not found");

				} else {
					System.out.println("welcome" + authenticatedUser.getFirstName());
				}
			} else if (command.equalsIgnoreCase("logout")) {
				authenticatedUser = null;
			} else if (authenticatedUser != null) {

				switch (command.toLowerCase()) {
				case "login":
					UserOperations.login();
					break;
				case "prod-add":
					ProductOperations.addProduct(product);
					break;
				case "prod-list":
					ProductOperations.listProducts();
					break;
				case "prod-delete":
					ProductOperations.deleteProduct();
					break;
				case "prod-update":
					ProductOperations.updateProduct(product);
					break;
				case "exit":
					// do something
					break;
				default:
					System.out.println("Invalid command");
					break;
				}
			} else {
				System.out.print("must login");
			}
		}

	}

}
