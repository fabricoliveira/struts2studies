package productmanagement.actions;

import javax.inject.Inject;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;
import productmanagement.dao.LoginDAOI;
import productmanagement.model.Login;

@Getter
@Setter
public class LoginAction extends ActionSupport {
	
	private String username;
	private String password;
	
	@Inject
	private LoginDAOI loginDAO;
	
	public String execute() {
		Login login = new Login(username, password);
		
		boolean isValid = loginDAO.isValidUser(login);
		 	
		if(isValid)
			return SUCCESS;
		else
			return INPUT;
	}

}
