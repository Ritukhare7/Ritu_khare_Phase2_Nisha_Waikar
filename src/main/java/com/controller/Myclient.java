package com.controller;

import java.util.List;

import com.dao.FlightDao;
import com.dao.FlightDaoImpl;
import com.dto.FlightDetails;

public class Myclient {

	FlightDao dao = new FlightDaoImpl();
	int flightno;
	String flightName;
	Integer ticketPrice;
	List<FlightDetails> details;
	
	public Myclient(String source, String destination) {
		// TODO Auto-generated constructor stub
		details =  dao.listFlight(source, destination);
	}
	
	public String doThis() {
		
		FlightDetails details = dao.searchFlight(2);
		System.out.println(details);
		return details.toString();
	}
	
	public Integer getTicketPrice() {
		Integer price=0;
		for(FlightDetails l : details) {
			price = l.getTicketPrice();
		}
			return price;
	}
	
	public String getFlightName() {
		
		for(FlightDetails l : details) {
			flightName = l.getFlightName();
		}
			return flightName;
	}
	
	
}
