package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;    
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ProductService;
import com.example.objects.Product;

@RestController
public class ProductController
{
	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	private List<Product> getAllProducts()
	{
		return service.getAllProducts();
	}
	
	@GetMapping("/products/{ProductID}")
	private Product getProducts(@PathVariable("ProductID") int productID) {
		return service.getProductById(productID);
	}
	
	@PostMapping("/products")
	private int saveProduct(@RequestBody Product product) {
		service.Save(product);
		return product.getProductID();
	}
}
