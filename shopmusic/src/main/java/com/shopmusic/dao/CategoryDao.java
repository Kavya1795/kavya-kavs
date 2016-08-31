package com.shopmusic.dao;

import java.util.List;

import com.shopmusic.model.Item;

public interface CategoryDao {

	List<Item> getItemByCategory(String category);
}
