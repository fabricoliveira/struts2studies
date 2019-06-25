package productmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import productmanagement.model.Product;
import productmanagement.utils.ConnectionFactory;

public class ProductDAO {

	public void save(Product product) {
		Connection connection = null;
		String sql = null;
		boolean isUpdate = product.getId() != null ? true : false;
		
		if(isUpdate)
			sql = "UPDATE products SET name=?, price=?, category=? WHERE id=?";
		else
			sql = "INSERT INTO products values (?, ?, ?)";

		try {
			connection = ConnectionFactory.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, product.getName());
			ps.setInt(2, product.getPrice());
			ps.setString(3, product.getCategory());
			
			if(isUpdate)
				ps.setLong(4, product.getId());

			if (isUpdate)
				ps.setLong(4, product.getId());

			ps.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			ConnectionFactory.closeConnection(connection);
		}

	}

	public static List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		Connection connection = null;
		String sql = "SELECT * FROM products";

		try {
			connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getLong("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("price"));
				product.setCategory(rs.getString("category"));
				products.add(product);
			}

		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			ConnectionFactory.closeConnection(connection);
		}

		return products;
	}

	public Product findById(Long id) {
		Product product = null;
		Connection connection = null;
		String sql = "SELECT * FROM products WHERE id=?";

		try {
			connection = ConnectionFactory.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				product = new Product();
				product.setId(rs.getLong("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("price"));
			}

		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			ConnectionFactory.closeConnection(connection);
		}

		return product;
	}

	public void delete(Long id) throws SQLException {
		String sql = "DELETE FROM products WHERE id=?";
		Connection connection = null;

		try {
			connection = ConnectionFactory.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, id);

			ps.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
	}

}
