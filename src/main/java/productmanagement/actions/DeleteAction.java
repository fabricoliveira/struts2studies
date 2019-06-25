package productmanagement.actions;

import javax.inject.Inject;

import com.opensymphony.xwork2.Action;

import lombok.Getter;
import lombok.Setter;
import productmanagement.dao.ProductDAOI;

@Getter
@Setter
public class DeleteAction implements Action {
	
	private Long id;
	
	@Inject
	private ProductDAOI productDAO;
	
	public String execute() {
		productDAO.delete(id);
		return SUCCESS;
	}

}
