package com.main.service;

import java.util.List;

import com.main.model.Categories;

public interface CategoriesService {
	Categories save(Categories c);
	List<Categories> findByCid(int cid);
	int deleteByCid(int cid);
	List<Categories> findAll(int page);
}
