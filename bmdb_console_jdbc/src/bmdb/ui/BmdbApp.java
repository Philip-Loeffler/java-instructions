package bmdb.ui;

import java.util.List;

import bmdb.business.Actor;
import bmdb.db.ActorDb;

public class BmdbApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the bootcamp movie database");
		System.out.println();
		System.out.println("Commands");
		System.out.println("la - List Actors");
		System.out.println("gabn - get an actor by last name");
		System.out.println("exit - Exit the application");

		String command = Console.getString("enter command:");
		while (!command.equalsIgnoreCase("exit")) {

			switch (command) {
			case "la":
				// creates actor object
				ActorDb actorDb = new ActorDb();
				// stores actors in list
				List<Actor> actors = actorDb.getAll();
				for (Actor actor : actors) {
					System.out.println(actor);
				}
				break;
			case "gabn":
				ActorDb actorDbGabn = new ActorDb();
				String lastName = Console.getString("Actors last name");
				Actor actor = actorDbGabn.get(lastName);
				if (actor == null) {
					System.out.println("no actor found");
				} else {
					System.out.println(actor);
				}
				break;
			}

			command = Console.getString("Enter command");
		}
	}

}
