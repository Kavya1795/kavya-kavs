package com.shopmusic.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopmusic.model.Item;


@Repository
public class ItemDaoImpl implements ItemDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void addProduct(Item item) {
		Session session=sessionFactory.getCurrentSession();
		Transaction tx= session.beginTransaction();
		session.save(item);
		tx.commit();
				
	}
	@SuppressWarnings("unchecked")
	public List<Item> viewItem() {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		List<Item> list=session.createCriteria(Item.class).list();
		return list;
	}

	@Override
	public void  deleteItem(int id) {
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Item item=session.get(Item.class,new Integer(id));
		session.delete(item);
		tx.commit();
		System.out.println("deleted:"+item.getItemName());
	}
	@Override
	public Item getItemById(int id) {
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Item item=session.load(Item.class,new Integer(id));
		return item;

		
	}
	@Override
	public void upadteItem(Item item) {
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.update(item);
		tx.commit();
		System.out.println("updated");
		
	}
}
