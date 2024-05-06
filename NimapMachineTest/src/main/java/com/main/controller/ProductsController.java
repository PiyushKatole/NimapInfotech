package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Products;
import com.main.service.ProductService;

@RestController
@RequestMapping("api/products")
public class ProductsController {
	@Autowired
	private ProductService service;
	
	@PostMapping
	public Products postProducts(@RequestBody Products p) {
		return service.save(p);
	}
	
	@GetMapping("/{pid}")
	public List<Products> getProducts(@PathVariable int pid){
		return service.findByPid(pid);
	}
	
	@DeleteMapping("/{pid}")
	public int deleteProducts(@PathVariable int pid) {
		return service.deleteByPid(pid);
	}
	
	@PutMapping
	public Products updateProducts(@RequestBody Products p) {
		return service.save(p);
	}
	
	@GetMapping
	public ResponseEntity<List<Products>> getAllProducts(
	         @RequestParam(defaultValue = "0") int page,
	         @RequestParam(required = false) Integer size) {
		
	    List<Products> all;
	    all = service.findAll(page);
	    return ResponseEntity.ok(all);
	}

}
