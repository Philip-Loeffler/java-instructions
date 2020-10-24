package bmdb.ui;

import java.time.LocalDate;
import java.util.List;

import bmdb.business.Actor;
import bmdb.db.ActorDb;

public class BmdbApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the bootcamp movie database");
		System.out.println();
		System.out.println("Commands");
		System.out.println("la - List Actors");
		System.out.println("aa - add actor");
		System.out.println("delete - delete actor by id");
		System.out.println("update - update actor by id");
		System.out.println("gabn - get an actor by last name");
		System.out.println("gabi - get an actor by ID");
		System.out.println("exit - Exit the application");

		ActorDb actorDb = new ActorDb();

		String command = Console.getString("enter command:");
		while (!command.equalsIgnoreCase("exit")) {

			switch (command) {
			case "la":
				// creates actor object
				// stores actors in list
				List<Actor> actors = actorDb.getAll();
				for (Actor actor : actors) {
					System.out.println(actor);
				}
				break;
			case "aa":
				addActor(actorDb);
				break;
			case "gabn":
				String lastName = Console.getString("Actors last name");
				Actor actor = actorDb.getActorByLastName(lastName);
				if (actor == null) {
					System.out.println("no actor found");
				} else {
					System.out.println(actor);
				}
				break;
			case "delete":
				long deleteId = Console.getInt("Actorid to delete");
				if (actorDb.delete(deleteId)) {
					System.out.println("Actor deleted successfully");
				} else {
					System.out.println("error actor");
				}
				break;
			case "update":
				updateActor(actorDb);

				break;
			case "gabi":
				long id = Console.getInt("Actor by id");
				Actor actorById = actorDb.get(id);
				if (actorById == null) {
					System.out.println("no actor found");
				} else {
					System.out.println(actorById);
				}
				break;
			}

			command = Console.getString("Enter command");
		}
	}

	private static void addActor(ActorDb actorDb) {
		String firstName = Console.getString("Actors first name");
		String lastName = Console.getString("Actors last name");
		String gender = Console.getString("Actors Gender");
		String birthDateStr = Console.getString("Actors birthday (YYYY-MM-DD:");
		LocalDate birthDate = LocalDate.parse(birthDateStr);

		Actor actor = new Actor(0, firstName, lastName, gender, birthDate);
		if (actorDb.add(actor)) {
			System.out.println("Actor added successfully");
		} else {
			System.out.println("error adding actor");
		}
	}

	private static void updateActor(ActorDb actorDb) {
		int updateId = Console.getInt("Actors id");
		String updateFirstName = Console.getString("Actors first name");
		String updatelastName = Console.getString("Actors last name");
		String updateGender = Console.getString("Actors Gender");
		String updateBirthDateStr = Console.getString("Actors birthday (YYYY-MM-DD:");
		LocalDate updateBirthDate = LocalDate.parse(updateBirthDateStr);

		Actor updatedActor = new Actor(updateId, updateFirstName, updatelastName, updateGender, updateBirthDate);
		if (actorDb.update(updatedActor)) {
			System.out.println("Actor updated successfully");
		} else {
			System.out.println("error actor");
		}
	}

}
