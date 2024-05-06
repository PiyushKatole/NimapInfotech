package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.dao.ProductDao;
import com.main.model.Products;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao dao;
	
	@Override
	public Products save(Products p) {
		return dao.save(p);
	}

	@Override
	public List<Products> findByPid(int pid) {
		return dao.findByPid(pid);
	}

	@Override
	public int deleteByPid(int pid) {
		return dao.deleteByPid(pid);
	}

	@Override
	public List<Products> findAll(int page) {
		return dao.findAll();
	}

}
