package com.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;



public class EmployeeMethodImplementation implements EmployeeMethods {

	public void addEmployee(Employee e1) {
//		int min =1;
//		int max = 999;
//		int randomNum = ThreadLocalRandom.current().nextInt(min, max);
		String QUERY = "INSERT into employee values()";
		
		try(Connection con = ConnectionUtil.getConnection();
				Statement stmt = con.createStatement())
		{
			int result = stmt.executeUpdate(QUERY);
			System.out.println(" Employee added :" + result);
			if (result == 1) 
				System.out.println("Success");
			else 
				System.out.println("Couldn't add data");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public ArrayList<Employee> getAllEmployees() {
		String QUERY = "SELECT * FROM employee";
		try(Connection con = ConnectionUtil.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY))
			{
				while (rs.next()) {
					int eno = rs.getInt("empno");
					String ename = rs.getString("empname");
					int esalary = rs.getInt("empsalary");
					String ecity = rs.getString("empcity");
					String estate = rs.getString("empstate");
					System.out.println("Record");
					System.out.println(eno + "," +ename+ "," +esalary+ "," +ecity+ "," +estate);
				}
		} catch (SQLException e) {e.printStackTrace(); }
		return null;
	}


	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		
	}
	
	
}
