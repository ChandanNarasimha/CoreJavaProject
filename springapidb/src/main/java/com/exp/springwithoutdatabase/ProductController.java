package com.exp.springwithoutdatabase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService ProductService;
	@GetMapping("/all")
	public List<Product> getAllProduct(){
		return this.ProductService.AllProduct();
		
	}

}
