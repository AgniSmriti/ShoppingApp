package com.niit.backendproject.Backend.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.backendproject.Backend.model.Category;
import com.niit.backendproject.Backend.model.Product;

public interface ProductDAO {

	boolean addProduct(Product p);
	
	
	List<Product>getAllProduct();
	

}
