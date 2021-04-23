package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.dto.FlightDetails;
import com.mysql.cj.Query;

public class FlightDaoImpl implements FlightDao{

	private SessionFactory factory;
	
    public FlightDaoImpl() {
    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
         factory = meta.getSessionFactoryBuilder().build(); 
    }
     
	@Override
	public Integer addFlights(FlightDetails details) {
		Integer flightNo = null;
		Session session = factory.openSession();
		Transaction transaction =session.beginTransaction();
		flightNo= (Integer) session.save(details);
		transaction.commit();
		session.close();
		
		return flightNo;
	}

	@Override
	public List<FlightDetails> listFlight() {
		
		List<FlightDetails> flightDetails = null;
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		// here hql will execute the query select *from flight_details;
		String hql= "FROM FlightDetails";
		TypedQuery<FlightDetails> query=  (TypedQuery<FlightDetails>) session.createQuery(hql);
		flightDetails = query.getResultList();
		session.close();
		
		return flightDetails;
	}
	
	@Override
	public List<FlightDetails> listFlight(String source, String destination) {
		
		List<FlightDetails> flightDetails = null;
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		// here hql will execute the query select *from flight_details;
		String hql= "FROM FlightDetails f where f.source = :source and f.destination = :destination";
		System.out.println("HQL is " + hql);
		//TypedQuery<FlightDetails> query=  (TypedQuery<FlightDetails>) session.createQuery(hql);
		org.hibernate.Query query = session.createQuery(hql);
		query.setParameter("source", source);
		query.setParameter("destination", destination);
		flightDetails = query.list();
		transaction.commit();
		session.close();
		System.out.println("From listFlight method"  + flightDetails.get(0));
		return flightDetails;
	}

	@Override
	public FlightDetails searchFlight(Integer flightNo) {
		Session session = factory.openSession();
	    Transaction txn = session.beginTransaction();
	    FlightDetails details = session.get(FlightDetails.class, flightNo);
	    session.close();
		return details;
	}

}
