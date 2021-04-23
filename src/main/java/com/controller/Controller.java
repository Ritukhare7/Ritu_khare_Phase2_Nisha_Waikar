package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.FlightDao;
import com.dao.FlightDaoImpl;
import com.dto.FlightDetails;

@WebServlet("/dam")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("JAAN");
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * FlightDetails details1 = new FlightDetails("AirAsia", "India", "USA", 5000);
		 * FlightDetails details2 = new FlightDetails("Indigo", "India", "Canada",
		 * 4000); FlightDetails details3 = new FlightDetails("AirExpress", "India",
		 * "Bali", 3000); FlightDao dao = new FlightDaoImpl(); Integer flightId1=
		 * dao.addFlights(details1); Integer flightId2= dao.addFlights(details2);
		 * Integer flightId3= dao.addFlights(details3); System.out.println(flightId1);
		 * System.out.println(flightId2); System.out.println(flightId3);
		 * 
		 */
		
		PrintWriter printWriter = response.getWriter();
		printWriter.print("He");
		printWriter.print("BAM");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//service(request, response);
		PrintWriter printWriter = response.getWriter();
		printWriter.print("He");
		printWriter.print("BAM");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printWriter = response.getWriter();
		printWriter.print("He");
		printWriter.print("BAM");
	}

}
