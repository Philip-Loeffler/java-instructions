package prs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import prs.business.Product;
import prs.excption.PrsDataException;

public class ProductDb {

	public ProductDb() {

	}

	private Connection getConnection() throws SQLException {
		// where is says bmdb that is saying what database we are connecting to
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "prs_user";
		String password = "sesame";

		// this will connect to our mysql db
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		return connection;
	}

	public List<Product> getAll() {
		String selectAll = "SELECT * FROM Product";
		try (Connection con = getConnection();
				// statement runs across that connection
				Statement stmt = con.createStatement();
				// results set is what we use to store the query
				ResultSet rs = stmt.executeQuery(selectAll)) {

			List<Product> products = new ArrayList<>();
			while (rs.next()) {
				int id = rs.getInt("ID");
				int vendorId = rs.getInt("VendorID");
				String partNumber = rs.getString("PartNumber");
				String name = rs.getString("Name");
				double price = rs.getDouble("Price");
				String unit = rs.getString("Unit");
				String photoPath = rs.getString("photoPath");

				Product product = new Product(id, vendorId, partNumber, name, price, unit, photoPath);
				products.add(product);
			}

			return products;

		} catch (SQLException e) {
			throw new PrsDataException("Error retrieving produts. Msg" + e.getMessage());
		}

	}

	public boolean delete(int id) {
		String productDelete = "DELETE FROM product WHERE ID = ?";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(productDelete)) {
			ps.setInt(1, id);
			ps.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return false;
		}
	}

	public boolean update(Product product) {
		String productUpdate = "UPDATE product SET VendorID = ?, PartNumber = ?, Name = ?, Price = ?, Unit = ?, PhotoPath = ? WHERE ID = ?";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(productUpdate)) {
			ps.setInt(1, product.getVendorId());
			ps.setString(2, product.getPartNumber());
			ps.setString(3, product.getName());
			ps.setDouble(4, product.getPrice());
			ps.setString(5, product.getUnit());
			ps.setString(6, product.getPhotoPath());
			ps.setInt(7, product.getId());
			ps.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return false;
		}
	}

	public boolean add(Product product) {
		String productInsert = "INSERT INTO product(VendorId, PartNumber, Name, Price, Unit, PhotoPath) VALUES (?,?, ?, ?, ?, ?)";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(productInsert)) {
			ps.setInt(1, product.getVendorId());
			ps.setString(2, product.getPartNumber());
			ps.setString(3, product.getName());
			ps.setDouble(4, product.getPrice());
			ps.setString(5, product.getUnit());
			ps.setString(6, product.getPhotoPath());
			ps.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.err.print("caught exception" + e);
			return false;
		}
	}
}
