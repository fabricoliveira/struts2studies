package br.com.strutsmaven.actions;

public class TestAction {
	
	private String message;
	private String firstName;
	private String lastName;

	public String execute() {
		System.out.println("--- execute() method called");
		message = "SUCCESS message";
		System.out.println("Name: " + firstName + " " + lastName);
		return "success";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
