package withdatabase.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import withdatabase.entity.Product;
import withdatabase.repsority.Productrepsority;




@Service
public class ProductService {
	@Autowired
	private Productrepsority productrepository;
	
	
	public List<Product> getAllProducts(){
		return productrepository.findAll();
		
	}
	

}
