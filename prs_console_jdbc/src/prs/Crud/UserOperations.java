package prs.Crud;

import prs.business.User;
import prs.db.UserDb;
import prs.ui.Console;

public class UserOperations {

	public static User login() {
		try {
			String userName = Console.getString("User Name: ");
			String password = Console.getString("passWord:");
			UserDb userDb = new UserDb();
			User user = userDb.authenticateUser(userName, password);
			System.out.println("authenticated user:" + user);
			return user;
		} catch (Exception e) {
			System.err.print("caught exception" + e);
			return null;
		}

	}

}
