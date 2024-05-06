package com.main.service;

import java.util.List;

import com.main.model.Products;

public interface ProductService {
	Products save(Products p);
	List<Products> findByPid(int pid);
	int deleteByPid(int pid);
	List<Products> findAll(int page);
}
