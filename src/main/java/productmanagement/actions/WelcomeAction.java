package productmanagement.actions;

import java.util.List;

import javax.inject.Inject;

import com.opensymphony.xwork2.Action;

import lombok.Getter;
import lombok.Setter;
import productmanagement.dao.ProductDAO;
import productmanagement.model.Product;

@Getter
@Setter
public class WelcomeAction implements Action {
	
	private List<Product> products;
	
	@Inject
	private ProductDAO productDAO;
	
	private void initializeProducts() {
		products = productDAO.getAllProducts();
	}
	
	public String execute() {
		initializeProducts();
		return SUCCESS;
	}
	
	public String back() {
		return SUCCESS;
	}
	
}
