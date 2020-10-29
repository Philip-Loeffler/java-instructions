package prs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import prs.business.Vendor;
import prs.excption.PrsDataException;

public class VendorDb {

	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "prs_user";
		String password = "sesame";
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		return connection;
	}

	public List<Vendor> getAll() {
		String selectAll = "SELECT * FROM Vendor";
		try (Connection con = getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(selectAll)) {
			List<Vendor> vendors = new ArrayList<>();
			while (rs.next()) {
				int id = rs.getInt("ID");
				String code = rs.getString("Code");
				String name = rs.getString("Name");
				String address = rs.getString("Address");
				String city = rs.getString("City");
				String state = rs.getString("State");
				String zip = rs.getString("Zip");
				String phoneNumber = rs.getString("PhoneNumber");
				String email = rs.getString("Email");
				Vendor vendor = new Vendor(id, code, name, address, city, state, zip, phoneNumber, email);

				vendors.add(vendor);
			}
			return vendors;
		} catch (SQLException e) {
			throw new PrsDataException("Error retrieving vendor. Msg: " + e.getMessage());
		}
	}

	public boolean delete(int id) {
		String UserDelete = "DELETE FROM vendor WHERE ID = ?";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(UserDelete)) {
			ps.setInt(1, id);
			ps.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return false;
		}
	}

	public boolean update(Vendor vendor) {
		String userUpdate = "UPDATE User SET Code = ?, Name = ?, Address = ?, City = ?, State = ?, Zip = ?, PhoneNumber = ?, Email = ?, WHERE ID = ?";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(userUpdate)) {
			ps.setString(1, vendor.getCode());
			ps.setString(2, vendor.getName());
			ps.setString(3, vendor.getAddress());
			ps.setString(4, vendor.getCity());
			ps.setString(5, vendor.getState());
			ps.setString(6, vendor.getZip());
			ps.setString(7, vendor.getPhoneNumber());
			ps.setString(8, vendor.getEmail());

			ps.setInt(9, vendor.getId());
			ps.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return false;
		}
	}

	public boolean add(Vendor vendor) {
		String userAdd = "INSERT INTO product(Code, Name, Address, City, State, Zip, PhoneNumber, Email) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(userAdd)) {
			ps.setString(1, vendor.getCode());
			ps.setString(2, vendor.getName());
			ps.setString(3, vendor.getAddress());
			ps.setString(4, vendor.getCity());
			ps.setString(5, vendor.getState());
			ps.setString(6, vendor.getZip());
			ps.setString(7, vendor.getPhoneNumber());
			ps.setString(8, vendor.getEmail());

			ps.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return false;
		}
	}

}
