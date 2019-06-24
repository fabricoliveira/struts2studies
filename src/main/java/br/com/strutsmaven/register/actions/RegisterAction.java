package br.com.strutsmaven.register.actions;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;
	private String email;
	
	public String execute() {
		System.out.println("execute() method called");
		
		return SUCCESS;
	}
	
	public void validate() {
		super.validate();
		
		if(firstName.trim().equals("")) {
			addFieldError("firstName", "First Name is required.");
		}
		
		if(lastName.trim().equals("")) {
			addFieldError("lastName", "Last Name is required.");
		}
		
		if(gender == null) {
			addFieldError("gender", "Gender is required.");
		}
		
		if(age == null) {
			addFieldError("age", "Age is required.");
		} else if(age <= 18) {
			addFieldError("age", "Age should be above 18.");
		}
		
		if(email.trim().equals("")) {
			addFieldError("email", "Gender is required.");
		}
		
	}

}
