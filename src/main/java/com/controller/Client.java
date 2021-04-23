package com.controller;

import java.util.List;

import com.dao.AdminDao;
import com.dao.AdminDaoImpl;
import com.dao.FlightDao;
import com.dao.FlightDaoImpl;
import com.dto.AdminDetails;
import com.dto.FlightDetails;

public class Client {

	public static void main(String[] args) {
		
		
//		FlightDetails details1 = new FlightDetails("AirAsia", "Bangalore", "Delhi", 5000);
//		FlightDetails details2 = new FlightDetails("Indigo", "Bangalore", "Mumbai", 4000);
//
		FlightDao dao = new FlightDaoImpl();
//		Integer flightId1 = dao.addFlights(details1);
//		Integer flightId2 = dao.addFlights(details2);
//
//		System.out.println(flightId1);
//		System.out.println(flightId2);
		 
		/*
		 * AdminDetails adminDetails = new AdminDetails("admin@gmail.com", "123@admin");
		 * AdminDao adminDao = new AdminDaoImpl(); Integer adminId =
		 * adminDao.addAdmin(adminDetails); System.out.println(adminDetails);
		 */
		
	//	List<FlightDetails> flightDetails= dao.listFlight();
		//System.out.println(flightDetails);
		FlightDetails details = dao.searchFlight(2);
		System.out.println(details);
		
		dao.listFlight("Delhi", "Mumbai");

	}

}
