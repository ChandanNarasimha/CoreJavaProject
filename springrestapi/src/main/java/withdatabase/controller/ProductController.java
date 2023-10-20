package withdatabase.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import withdatabase.entity.Product;
import withdatabase.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController{
@Autowired
	private ProductService productService;
	@GetMapping("/all")
	public List<Product> getAllProduct(){
		return this.productService.getAllProducts();

	}
}