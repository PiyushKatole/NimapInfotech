package com.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Products;

@Repository
public interface ProductDao extends JpaRepository<Products, Integer>{
	Products save(Products p);
	List<Products> findByPid(int pid);
	int deleteByPid(int pid);
	List<Products> findAll();
}
