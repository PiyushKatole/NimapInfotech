package com.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Categories;

@Repository
public interface CategoriesDao extends JpaRepository<Categories, Integer>{
	Categories save(Categories c);
	List<Categories> findByCid(int cid);
	int deleteByCid(int cid);
	List<Categories> findAll();
}
