package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FinalBooking
 */
@WebServlet("/go")
public class FinalBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public FinalBooking() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("done");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Operate operate = new Operate();
		PrintWriter out = response.getWriter();
		String name=request.getParameter("name");
		String mail= request.getParameter("mailId");
		int cardNo=Integer.parseInt(request.getParameter("cardNo"));
		int phoneNo=Integer.parseInt(request.getParameter("phoneNo"));
		out.print("<html>");
		out.print("<h2>Passenger Summary</h2>");
		out.println("Passenger Name" + " " + name + "<br> " + "Email : " + " " + mail + "<br>" + "Phone Number" + " " + phoneNo + "<br>");
		
		out.print("<h2>Ticket Summary</h2>");
		out.println("<h4>"+ Operate.getSource() + "</h4>" + "<h5>To</h5>" + "<h4>"+ Operate.getdestination() + "</h4>" + "<br>");
		//out.println(Operate.getdestination());
		
		out.println("Number of travellers " + " " + Operate.getNoOfPerson());
		
		out.print("<h2>Payment Summary</h2>");
		out.println("Payment done by " + " " + name + "<br>" + "<h5>Total Amount Paid</h5>" + " " + Operate.getPrice()+"/-Only" + "<br>");
		
		out.print("</html>");
		
		
		
		
	}

}
