package bmdb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bmdb.business.Actor;
import bmdb.business.Movie;

public class MovieDb {

	private Connection getConnection() throws SQLException {
		// where is says bmdb that is saying what database we are connecting to
		String dbURL = "jdbc:mysql://localhost:3306/bmdb?useSSL=false&allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "bmdb_user";
		String password = "sesame";

		// this will connect to our mysql db
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		return connection;
	}

	public List<Movie> getAll() {
		List<Movie> movieList = new ArrayList<>();

		try (Connection con = getConnection();
				// statement runs across that connection
				Statement stmt = con.createStatement();
				// results set is what we use to store the query
				ResultSet movie = stmt.executeQuery("SELECT * FROM Movie");)

		{

			// this will go through every row and eventually return false
			while (movie.next()) {
				Movie movies = getMovieFromResultSet(movie);
				movieList.add(movies);
			}
		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return null;
		}
		// close everything that has been opened
		// had closes before we used try with resources
//			actors.close();
//			stmt.close();
//			con.close();

		return movieList;
	}

	public Movie get(String lastName) {
		String movieSelect = "SELECT * FROM ACTOR WHERE LastName = '" + lastName + " '";
		try (Connection con = getConnection();
				// statement runs across that connection
				Statement stmt = con.createStatement();
				// results set is what we use to store the query
				ResultSet movies = stmt.executeQuery(movieSelect);) {

			// will execute if there is one row
			if (movies.next()) {
				long id = movies.getLong("ID");
				String tile = movies.getString("Title");
				int year = movies.getInt("Year");
				String Rating = movies.getString("Rating");
				String director = movies.getString("Director");

				// fully populated actor object from the db.
				Movie movie = new Movie(id, tile, year, Rating, director);
				return movie;
			} else {
				return null;
			}

		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return null;
		}
	}

	public Movie getMovieFromResultSet(ResultSet rs) throws SQLException {
		List<Actor> movieList = new ArrayList<>();

		// the string is the column name from the db
		long id = rs.getLong("ID");
		String tile = rs.getString("Title");
		int year = rs.getInt("Year");
		String Rating = rs.getString("Rating");
		String director = rs.getString("Director");

		// fully populated actor object from the db.
		Movie movie = new Movie(id, tile, year, Rating, director);
		return movie;

	}
}
