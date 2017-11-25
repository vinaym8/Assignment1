package com.mtc.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.actionbazaar.persistence.Address;
import com.actionbazaar.persistence.Bid;
import com.actionbazaar.persistence.Bidder;
import com.actionbazaar.persistence.Item;
import com.actionbazaar.persistence.Seller;
import com.actionbazaar.persistence.User;
import com.mtc.app.entity.Product;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	static{
		
		Configuration configuration = new Configuration();
		
		//Loads hibernate.cfg.xml
		configuration.configure();
		
//		configuration.addAnnotatedClass(Product.class);
		//configuration.addAnnotatedClass(Item.class);
		//configuration.addAnnotatedClass(Bid.class);
		configuration.addAnnotatedClass(User.class);
		configuration.addAnnotatedClass(Bidder.class);
		configuration.addAnnotatedClass(Seller.class);
		configuration.addAnnotatedClass(Address.class);




		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		 sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
