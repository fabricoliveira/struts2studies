package productmanagement.dao;

import java.util.List;

import productmanagement.model.Product;

public interface ProductDAOI {

	void save(Product product);
	
	List<Product> getAllProducts();
	
	Product findById(Long id);
	
	void delete(Long id);
	
}
