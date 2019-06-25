package productmanagement.actions;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;
import productmanagement.dao.LoginDAO;
import productmanagement.model.Login;

@Getter
@Setter
public class LoginAction extends ActionSupport {
	
	private String username;
	private String password;
	
	public String execute() {
		Login login = new Login(username, password);
		
		boolean isValid = LoginDAO.isValidUser(login);
		
		if(isValid)
			return SUCCESS;
		else
			return INPUT;
	}

}
