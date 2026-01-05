package com.santt4na.spring_project.controller;

import com.santt4na.spring_project.model.Product;
import com.santt4na.spring_project.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {
	
	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping()
	public ResponseEntity<List<Product>> getListAllProducts(){
		return ResponseEntity.ok(productService.findAllProducts());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findProduct(@PathVariable Long id){
		Product product = productService.findProductById(id);
		return ResponseEntity.ok(product);
	}
	
	@PostMapping()
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		return ResponseEntity.ok(productService.createProduct(product));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product){
		return ResponseEntity.ok(productService.updateProduct(id, product));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
		return ResponseEntity.noContent().build();
	}
}
