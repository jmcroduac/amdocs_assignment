package com.training.springboot.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.training.springboot.model.Product;
import com.training.springboot.repository.HomeRepository;

@Service
public class HomeService {
	
	@Autowired
	HomeRepository repo;
	
	public void saveProduct(String productName, int productPrice) {
		Product product = new Product(productName,productPrice);
		repo.save(product);
		System.out.println("Product " + product.getProductName() + " saved!");
	}

	public List<Product> getAllProducts() {
		return repo.findAll();
	}
	
	public Optional<Product> findProduct(int id) {
		return repo.findById(id);
	}
	
	public void addProduct(Product product) {
		repo.save(product);
	}
	
	public void deleteProduct(int id) {
		repo.deleteById(id);
	}


}