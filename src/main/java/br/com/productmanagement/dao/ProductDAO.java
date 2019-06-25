package br.com.productmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.productmanagement.model.Product;
import br.com.productmanagement.utils.ConnectionFactory;

public class ProductDAO {
	
	private Connection connection = null;
	
	public void create(Product product) throws SQLException {
		String sql = "INSERT INTO products values (?, ?)";
		
		connection = new ConnectionFactory().getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, product.getName());
		ps.setInt(2, product.getPrice());
		
		ps.executeUpdate();
		
		connection.close();
	}
	
	public List<Product> read() throws SQLException {
		String sql = "SELECT * FROM products";
		List<Product> products = new ArrayList<>();
		
		connection = new ConnectionFactory().getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			Product product = new Product();
			product.setId(rs.getLong("id"));
			product.setName(rs.getString("name"));
			product.setPrice(rs.getInt("price"));
			
			products.add(product);
		}
		
		connection.close();
		
		return products;
	}
	
	public void update(Product product) throws SQLException {
		String sql = "UPDATE product SET name=?, price=? WHERE id=?";
		
		connection = new ConnectionFactory().getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, product.getName());
		ps.setInt(2, product.getPrice());
		ps.setLong(3, product.getId());
		
		ps.executeUpdate();
		
		connection.close();
	}
	
	public void delete(Long id) throws SQLException {
		String sql = "DELETE FROM product WHERE id=?";
		
		connection = new ConnectionFactory().getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setLong(1, id);
		
		ps.executeUpdate();
		
		connection.close();
	}
	
	public Product findById(Long id) throws SQLException {
		String sql = "SELECT * FROM products WHERE id=?";
		Product product = null;
		
		connection = new ConnectionFactory().getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setLong(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			product = new Product();
			product.setId(rs.getLong("id"));
			product.setName(rs.getString("name"));
			product.setPrice(rs.getInt("price"));
		}
		
		connection.close();
		
		return product;
	}

}
