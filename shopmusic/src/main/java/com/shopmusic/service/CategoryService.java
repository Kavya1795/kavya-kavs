package com.shopmusic.service;

import java.util.List;

import com.shopmusic.model.Item;

public interface CategoryService {

	List<Item> getItemByCategory(String category);
}
