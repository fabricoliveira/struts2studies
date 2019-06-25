package productmanagement.actions;

import javax.inject.Inject;

import com.opensymphony.xwork2.Action;

import lombok.Getter;
import lombok.Setter;
import productmanagement.dao.ProductDAOI;
import productmanagement.model.Product;

@Getter
@Setter
public class AddAction implements Action {
	
	private String name;
	private Integer price;
	private String category;
	
	@Inject
	private ProductDAOI productDAO;
	
	public String execute() {
		
		Product product = new Product(null, name, price, category);
		productDAO.save(product);
		
		return SUCCESS;
	} 

}
