package com.shopmusic.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopmusic.dao.ItemDao;
import com.shopmusic.model.Item;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	ItemDao itemDao;

	@Override
	public void addProduct(Item item) {
		itemDao.addProduct(item);
		
	}
	@Override
	public void deleteItem(int id) {
		itemDao.deleteItem(id);
		
	}

	@Override
	public List<Item> viewItem() {
		
		return itemDao.viewItem();
	}

	@Override
	public Item getItemById(int id) {
		return itemDao.getItemById(id);
		
	}
	

	@Override
	public void upadteItem(Item item) {
		itemDao.upadteItem(item);
		
	}

	

	


}
	