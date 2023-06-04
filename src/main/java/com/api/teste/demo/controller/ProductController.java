package com.api.teste.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.teste.demo.entities.Department;
import com.api.teste.demo.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@GetMapping
	public List<Product> getObjects() {
		Department d1 = new Department(1L,"Tech");
		Department d2 = new Department(2L,"Pet");
				
		Product p1 = new Product(1L, "Macbook Pro", 4000.0,d1);
		Product p2 = new Product(2L, "Tech Pro", 5000.0,d1);
		Product p3 = new Product(3L, "pet Pro", 100.0,d2);
		
		List<Product> list = Arrays.asList(p1,p2,p3);
		return list;
	}
	
	
}
