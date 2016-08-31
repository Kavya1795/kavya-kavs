package com.shopmusic.service;




import java.util.List;

import com.shopmusic.model.Item;

public interface ItemService {
	void addProduct(Item item);
	List<Item> viewItem(); 
	void deleteItem(int id);
	Item getItemById(int id);
	void upadteItem(Item item);


}
