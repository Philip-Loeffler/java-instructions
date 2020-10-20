package bmdb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bmdb.business.Actor;

public class ActorDb {

	private Connection getConnection() throws SQLException {
		// where is says bmdb that is saying what database we are connecting to
		String dbURL = "jdbc:mysql://localhost:3306/bmdb?useSSL=false&allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "bmdb_user";
		String password = "sesame";

		// this will connect to our mysql db
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		return connection;
	}

	public List<Actor> getAll() {
		List<Actor> actorList = new ArrayList<>();

		try (Connection con = getConnection();
				// statement runs across that connection
				Statement stmt = con.createStatement();
				// results set is what we use to store the query
				ResultSet actors = stmt.executeQuery("SELECT * FROM Actor");)

		{

			// this will go through every row and eventually return false
			while (actors.next()) {
				// the string is the column name from the db
				long id = actors.getLong("ID");
				String firstName = actors.getString("FirstName");
				String lastName = actors.getString("LastName");
				String gender = actors.getString("Gender");
				String birthDate = actors.getString("BirthDate");

				// fully populated actor object from the db.
				Actor actor = new Actor(id, firstName, lastName, gender, LocalDate.parse(birthDate));

				actorList.add(actor);
			}
		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return null;
		}
		// close everything that has been opened
		// had closes before we used try with resources
//		actors.close();
//		stmt.close();
//		con.close();

		return actorList;
	}

	public Actor get(String lastName) {
		String actorSelect = "SELECT * FROM ACTOR WHERE LastName = '" + lastName + " '";
		try (Connection con = getConnection();
				// statement runs across that connection
				Statement stmt = con.createStatement();
				// results set is what we use to store the query
				ResultSet actors = stmt.executeQuery(actorSelect);) {

			// will execute if there is one row
			if (actors.next()) {
				long id = actors.getLong("ID");
				String firstName = actors.getString("FirstName");
				String lName = actors.getString("LastName");
				String gender = actors.getString("Gender");
				String birthDate = actors.getString("BirthDate");

				// fully populated actor object from the db.
				Actor actor = new Actor(id, firstName, lName, gender, LocalDate.parse(birthDate));
				return actor;
			} else {
				return null;
			}

		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return null;
		}
	}
}
