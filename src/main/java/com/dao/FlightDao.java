package com.dao;

import java.util.List;
import com.dto.FlightDetails;

public interface FlightDao {

	public Integer addFlights(FlightDetails details);
	
	public List<FlightDetails> listFlight();
	public FlightDetails searchFlight(Integer flightno);

	List<FlightDetails> listFlight(String source, String destination);
}
