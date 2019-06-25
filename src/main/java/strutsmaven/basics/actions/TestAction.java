package strutsmaven.basics.actions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

}
