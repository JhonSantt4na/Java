package com.santt4na.spring_project.service;

import com.santt4na.spring_project.exceptions.NotFoundException;
import com.santt4na.spring_project.model.Product;
import com.santt4na.spring_project.repository.MessageRepository;
import com.santt4na.spring_project.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
	
	private final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository, MessageRepository messageRepository) {
		this.productRepository = productRepository;
	}
	
	//Create
	public Product createProduct(Product product){
		Product newProduct = new Product();
		newProduct.setName(product.getName());
		newProduct.setPrice(product.getPrice());
		productRepository.save(newProduct);
		return newProduct;
	}
	
	//Updated
	public Product updateProduct(long id, Product product) {
		Product existingProduct = findProductById(id);
		
		existingProduct.setName(product.getName());
		existingProduct.setPrice(product.getPrice());
		System.out.println("Product Updated: " + existingProduct);
		return productRepository.save(existingProduct);
	}
	
	//FindById
	public Product findProductById(Long id){
		System.out.println("Product Found with ID : " + id);
		return productRepository.findById(id)
			.orElseThrow(() -> new NotFoundException("Product not found with id: " + id));
	}
	
	//FindAll
	public List<Product> findAllProducts(){
		List<Product> products = productRepository.findAll();
		System.out.println("List with all Product :" + products);
		return products;
	}
	
	//Delete
	public void deleteProduct(Long id){
		if (!productRepository.existsById(id)){
			throw new NotFoundException("Product Not Found with ID : " + id);
		}
		productRepository.deleteById(id);
		System.out.println("Product Deleted");
	}
}