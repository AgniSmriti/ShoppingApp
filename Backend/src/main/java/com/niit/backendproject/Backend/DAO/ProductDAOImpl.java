package com.niit.backendproject.Backend.DAO;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backendproject.Backend.model.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {


	@Autowired
	SessionFactory sessionFactory;

	public boolean addProduct(Product p) {
		Session ss=sessionFactory.getCurrentSession();
		
		
		try{
			ss.persist(p);
		return true;
		}
		catch(Exception e){return false;}
			}

	public List<Product> getAllProduct() {
		Session ss=sessionFactory.getCurrentSession();
		Query qu=ss.createQuery("from Product");
		@SuppressWarnings("unchecked")
		List<Product> listProduct=(List<Product>)qu.list();
		return listProduct;
	
	}


	

}
