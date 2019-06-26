package productmanagement.actions;

import javax.inject.Inject;

import com.opensymphony.xwork2.Action;

import lombok.Getter;
import lombok.Setter;
import productmanagement.dao.ProductDAO;
import productmanagement.model.Product;

@Getter
@Setter
public class SaveAction implements Action {
	
	private Long id;
	private String name;
	private Integer price;
	private String category;
	
	@Inject
	private ProductDAO productDAO;
	
	public String execute() {
		
		Product product = new Product(id, name, price, category);
		productDAO.save(product);
		
		return SUCCESS;
	} 

}
