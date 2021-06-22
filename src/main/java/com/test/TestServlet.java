package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    EmployeeMethodImplementation emi = new EmployeeMethodImplementation();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");//setting the content type  
//		PrintWriter pw=response.getWriter();//get the stream to write the data  
//		  
//		//writing html in the stream  
//		pw.println("<html><body>");  
//		pw.println("Welcome to servlet12 made without using Annotation but xml instead");  
//		pw.println("</body></html>");  
//		  
//		pw.close();//closing the stream
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter pw=response.getWriter();
		String empName = request.getParameter("empName");
		String empSalary = request.getParameter("empSalary");
		String empCity = request.getParameter("empCity");
		String empState = request.getParameter("empState");
		String htmlResponse = "<html>";
		htmlResponse += "<h4>You entered: " + empName + " " + 
		empSalary + " " + empCity + " " + empState + "</h4>";
		htmlResponse += "</html>";
		pw.println(htmlResponse);
		pw.println(emi.getAllEmployees());
		
//		emi.addEmployee(empName, empSalary, );
		pw.close();
	}

}
