package com.product.service;

import java.util.List;

import com.product.entity.Product;

public interface ProductService {
	public List<Product> getAllProduct();

	public List<Product> getAllProductByCategory(String category);

	public Product getProductById(Long id);

	public List<Product> getAllProductsByName(String name);

	public Product addProduct(Product product);

	public void deleteProduct(Long productId);
}
