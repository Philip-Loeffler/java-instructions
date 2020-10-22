package bmdb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
				Actor actor = getActorFromResultSet(actors);
				actorList.add(actor);
				// fully populated actor object from the db.

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
//	public List<Actor> getAll() {
//		List<Actor> actorList = new ArrayList<>();
//
//		try (Connection con = getConnection();
//				// statement runs across that connection
//				Statement stmt = con.createStatement();
//				// results set is what we use to store the query
//				ResultSet actors = stmt.executeQuery("SELECT * FROM Actor");)
//
//		{
//
//			// this will go through every row and eventually return false
//			while (actors.next()) {
//				// the string is the column name from the db
//				long id = actors.getLong("ID");
//				String firstName = actors.getString("FirstName");
//				String lastName = actors.getString("LastName");
//				String gender = actors.getString("Gender");
//				String birthDate = actors.getString("BirthDate");
//
//				// fully populated actor object from the db.
//				Actor actor = new Actor(id, firstName, lastName, gender, LocalDate.parse(birthDate));
//
//				actorList.add(actor);
//			}
//		} catch (SQLException e) {
//			System.err.print("caught exception" + e);
//			return null;
//		}
//		// close everything that has been opened
//		// had closes before we used try with resources
////		actors.close();
////		stmt.close();
////		con.close();
//
//		return actorList;
//	}

	public Actor getActorByLastName(String lastName) {
		String actorSelect = "SELECT * FROM ACTOR WHERE LastName = ?";
		try (Connection con = getConnection();
				// statement runs across that connection
				PreparedStatement ps = con.prepareStatement(actorSelect);) // results set is what we use to store the
																			// query
		{
			ps.setString(1, lastName);
			ResultSet actors = ps.executeQuery();
			// will execute if there is one row
			if (actors.next()) {
				Actor actor = getActorFromResultSet(actors);
				actors.close();
				return actor;
			} else {
				actors.close();
				return null;
			}

		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return null;
		}
	}

	public Actor get(long id) {
		String actorSelect = "SELECT * FROM ACTOR WHERE ID = ?";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(actorSelect);) {
			ps.setLong(1, id);
			ResultSet actors = ps.executeQuery();

			// will execute if there is one row
			if (actors.next()) {
				Actor actor = getActorFromResultSet(actors);
				actors.close();
				return actor;
			} else {
				actors.close();
				return null;
			}

		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return null;
		}
	}

	public boolean add(Actor actor) {
		String actorInsert = "INSERT INTO actor(FirstName, LastName, Gender, BirthDate) VALUES (?, ?, ?, ?)";

		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(actorInsert)) {
			ps.setString(1, actor.getFirstName());
			ps.setString(2, actor.getLastName());
			ps.setString(3, actor.getGender());
			ps.setString(4, actor.getBirthDate().toString());

			ps.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return false;
		}
	}

	public boolean update(Actor actor) {
		String actorUpdate = "UPDATE actor SET FirstName = ?, LastName = ?, Gender = ?, BirthDate = ? WHERE ID = ?";

		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(actorUpdate)) {
			ps.setString(1, actor.getFirstName());
			ps.setString(2, actor.getLastName());
			ps.setString(3, actor.getGender());
			ps.setString(4, actor.getBirthDate().toString());
			ps.setLong(5, actor.getId());

			ps.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return false;
		}
	}

	public boolean delete(long id) {
		String actorDelete = "DELETE FROM actor WHERE ID = ?";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(actorDelete)) {
			ps.setLong(1, id);
			ps.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return false;
		}
	}

	private Actor getActorFromResultSet(ResultSet rs) throws SQLException {

		// the string is the column name from the db
		long id = rs.getLong("ID");
		String firstName = rs.getString("FirstName");
		String lastName = rs.getString("LastName");
		String gender = rs.getString("Gender");
		String birthDate = rs.getString("BirthDate");

		// fully populated actor object from the db.
		Actor actor = new Actor(id, firstName, lastName, gender, LocalDate.parse(birthDate));
		return actor;

	}
}
