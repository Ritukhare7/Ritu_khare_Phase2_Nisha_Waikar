package com.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="flights_details")
public class FlightDetails {

	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	@Column(name="flight_no")
	private int flightNo;
	
	@Column(name="flight_name")
	private String flightName;
	
	@Column(name="source")
	private String source;
	
	@Column(name="destination")
	private String destination;
	
	/*
	 * @Column(name="date")
	 * 
	 * @Temporal(TemporalType.DATE) private Date dateOfBooking;
	 */
	
	@Column(name="price")
	private int ticketPrice;
	
	public FlightDetails() {}

	public FlightDetails(String flightName, String source, String destination,  int ticketPrice) {
		super();
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		//this.dateOfBooking = dateOfBooking;
		this.ticketPrice = ticketPrice;
	}

	public int getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	/*
	 * public Date getDateOfBooking() { return dateOfBooking; }
	 * 
	 * public void setDateOfBooking(Date dateOfBooking) { this.dateOfBooking =
	 * dateOfBooking; }
	 */

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "FlightDetails [flightNo=" + flightNo + ", flightName=" + flightName + ", source=" + source
				+ ", destination=" + destination + ",  ticketPrice=" + ticketPrice
				+ "]";
	}
	
	
}
