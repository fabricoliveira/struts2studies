package br.com.strutsmaven.register.actions;

import com.opensymphony.xwork2.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterAction implements Action {
	
	private String firstName;
	private String lastName;
	private String gender;
	private String age;
	private String email;
	
	public String execute() {
		System.out.println("execute() method called");
		
		return SUCCESS;
	}

}
