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

import com.main.model.Categories;
import com.main.service.CategoriesService;

@RestController
@RequestMapping("api/categories")
public class CategoriesController {
	@Autowired
	private CategoriesService service;
	
	@PostMapping
	public Categories postCategories(@RequestBody Categories c) {
		return service.save(c);
	}
	
	@GetMapping("/{cid}")
	public List<Categories> getCategories(@PathVariable int cid) {
		return service.findByCid(cid);
	}
	
	@DeleteMapping("/{cid}")
	public int deleteCategories(@PathVariable int cid) {
		return service.deleteByCid(cid);
	}
	
	@PutMapping
	public Categories updateCategories(@RequestBody Categories c) {
		return service.save(c);
	}
	
	@GetMapping
	public ResponseEntity<List<Categories>> getAllCategories(
	         @RequestParam(defaultValue = "0") int page,
	         @RequestParam(required = false) Integer size) {
	    List<Categories> all;
	    all = service.findAll(page);
	    return ResponseEntity.ok(all);
	}
}
