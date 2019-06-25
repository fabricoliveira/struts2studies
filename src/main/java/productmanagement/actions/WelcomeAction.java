package productmanagement.actions;

import java.util.List;

import com.opensymphony.xwork2.Action;

import lombok.Getter;
import lombok.Setter;
import productmanagement.dao.ProductDAO;
import productmanagement.model.Product;

@Getter
@Setter
public class WelcomeAction implements Action {
	
	private List<Product> products;
	
	private void initializeProducts() {
		products = ProductDAO.getAllProducts();
	}
	
	public String execute() {
		initializeProducts();
		return SUCCESS;
	}

}
