package com.unir.products.service;

import java.util.List;

import com.unir.products.data.model.Product;
import com.unir.products.controller.model.CreateProductRequest;

public interface ProductsService {
	
	List<Product> getProducts();
	
	Product getProduct(String productId);
	
	Boolean removeProduct(String productId);
	
	Product createProduct(CreateProductRequest request);

}
