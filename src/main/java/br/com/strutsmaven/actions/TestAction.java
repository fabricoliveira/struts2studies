package br.com.strutsmaven.actions;

public class TestAction {
	
	private String message;

	public String execute() {
		System.out.println("--- execute() method called");
		message = "SUCCESS message";
		return "success";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
