package com.shopmusic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopmusic.dao.CategoryDao;
import com.shopmusic.model.Item;
@Service
public class CategoryServiceImpl implements CategoryService{
   @Autowired
   CategoryDao categoryDao;

@Override
public List<Item> getItemByCategory(String category) {
	return categoryDao.getItemByCategory(category);
}
	
	

}
