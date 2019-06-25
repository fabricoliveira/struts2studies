package br.com.productmanagement.actions;

import com.opensymphony.xwork2.ActionSupport;

import br.com.productmanagement.dao.LoginDAO;
import br.com.productmanagement.model.Login;
import lombok.Getter;
import lombok.Setter;

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
