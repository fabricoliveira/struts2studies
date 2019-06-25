package strutsmaven.register.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;
import productmanagement.model.Product;

@Getter
@Setter
public class RegisterAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;
	private String email;
	private String address;
	private String color;
	private List<String> colors;
	private String selectedColor;
	private Boolean subscription;
	private String hobby;
	private List<String> hobbies;
	private List<Product> products;
	
	public String execute() {
		System.out.println("execute() method called");
		
		if(subscription == true) {
			System.out.println("You are a subscriber!");
		} else {
			System.out.println("You are not a subscriber!");
		}
		return SUCCESS;
	}
	
	public String initializeFormFields() {
		initializeColors();
		initializeHobbies();
		initializeProducts();
		return INPUT;
	}

	private void initializeProducts() {
		products = new ArrayList<>();
		products.add(new Product(111L, "iPhone", 10000, "Mobile Phone"));
		products.add(new Product(222L, "Panasonic", 7000, "Camera"));
		products.add(new Product(333L, "LG", 20000, "TV"));
		products.add(new Product(444L, "Macbook", 30000, "Laptop"));
	}

	private void initializeHobbies() {
		hobbies = new ArrayList<>();
		hobbies.add("Drawing");
		hobbies.add("Teaching");
		hobbies.add("Singing");
		hobbies.add("Programming");
	}

	private void initializeColors() {
		colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("White");
	}
	
//	public void validate() {
//		super.validate();
//		
//		if(firstName.trim().equals("")) {
//			addFieldError("firstName", "First Name is required.");
//		}
//		
//		if(lastName.trim().equals("")) {
//			addFieldError("lastName", "Last Name is required.");
//		}
//		
//		if(gender == null) {
//			addFieldError("gender", "Gender is required.");
//		}
//		
//		if(age == null) {
//			addFieldError("age", "Age is required.");
//		} else if(age <= 18) {
//			addFieldError("age", "Age should be above 18.");
//		}
//		
//		if(email.trim().equals("")) {
//			addFieldError("email", "Gender is required.");
//		}
//	}

}
