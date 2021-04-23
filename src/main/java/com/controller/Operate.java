package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetData")
public class Operate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String source;
	static String destination;
	static int numberOfPeople;
	static int price;
	static String date;
	
    public Operate() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		//response.sendRedirect("PersonDetails.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter printWriter = response.getWriter();
		
		source = request.getParameter("Source");
				
		 destination = request.getParameter("Destination");
		 numberOfPeople = Integer.parseInt(request.getParameter("Countperson"));
		  date = request.getParameter("traveldate");
		 printWriter.print("<html>");
		printWriter.print("You are travelling  from " + " " + source + " " + "to" + " " +  destination  + " " +"On"+ " "+ date + "and number of passengers is "+ numberOfPeople + "<br>");
		
		Myclient myclient = new Myclient(source, destination);
		 price = myclient.getTicketPrice()*numberOfPeople;
		
		printWriter.print("Total Amount to be paid is " + " " + "Rs"+myclient.getTicketPrice()*numberOfPeople + "<br>");
		printWriter.print("Available flight is " + " " + myclient.getFlightName() + "<br>" + "Please click on 'Book Flight' to confirm your booking. ");
		printWriter.print("<form action=\"PersonDetails.html\">\r\n"
				+ "<input type=\"submit\" value=\"Book Flight\"/><br/>\r\n"
				+ "<br/>\r\n"
				+ "</form>");
		 printWriter.print("</html>");

		
		  
		 

	}

	public static String getSource(){
		return source;
	}
	public static String getdestination(){
		return destination;
	}
	public static int getNoOfPerson(){
		return numberOfPeople;
	}
	public static int getPrice(){
		return price;
	}
	public static String getDate() {
		return date;
	}
	
}
