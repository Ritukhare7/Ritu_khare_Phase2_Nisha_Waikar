package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.dto.AdminDetails;

public class AdminDaoImpl implements AdminDao{

	private SessionFactory factory;
	
	public AdminDaoImpl() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
         factory = meta.getSessionFactoryBuilder().build();
	}
	@Override
	public Integer addAdmin(AdminDetails adminDetails) {
		Integer adminId =null;
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		adminId = (Integer) session.save(adminDetails);
		transaction.commit();
		session.close();
		
		return adminId;
	}

}
