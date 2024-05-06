package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.dao.CategoriesDao;
import com.main.model.Categories;

@Service
@Transactional
public class CategoriesServiceImpl implements CategoriesService{

	@Autowired
	private CategoriesDao dao;
	
	@Override
	public Categories save(Categories c) {
		return dao.save(c);
	}

	@Override
	public List<Categories> findByCid(int cid) {
		return dao.findByCid(cid);
	}

	@Override
	public int deleteByCid(int cid) {
		return dao.deleteByCid(cid);
	}

	@Override
	public List<Categories> findAll(int page) {
		return dao.findAll();
	}

}
