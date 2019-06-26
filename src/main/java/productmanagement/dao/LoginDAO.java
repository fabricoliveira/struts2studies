package productmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import productmanagement.model.Login;
import productmanagement.utils.ConnectionFactory;

@Named
@RequestScoped
public class LoginDAO {
	
	@Inject
	Connection connection;
	
	public boolean isValidUser(Login login) {
		boolean validStatus = false;
		try {
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
