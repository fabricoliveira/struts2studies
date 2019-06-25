package productmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import productmanagement.model.Login;
import productmanagement.utils.ConnectionFactory;

public class LoginDAO {
	
	public static boolean isValidUser(Login login) {
		Connection connection = null;
		boolean validStatus = false;
		try {
			connection = ConnectionFactory.getConnection();
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM login WHERE username=? and password=?");
			ps.setString(1, login.getUsername());
			ps.setString(2, login.getPassword());
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				validStatus = true;				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(connection);
		}
		
		return validStatus;
	}

}
