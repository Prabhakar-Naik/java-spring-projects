package com.SpringBoot.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.SpringBoot.Model.Employee;

public class EmployeeDAO_Imp<JdbcTemplate> implements  EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplet;




	public JdbcTemplate getJdbcTemplet() {
		return jdbcTemplet;
	}

	public void setJdbcTemplet(JdbcTemplate jdbcTemplet) {
		this.jdbcTemplet = jdbcTemplet;
	}

	private String dbDriver="oracle.jdbc.driver.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String uname="prabhakar";
	private String pwd="prabha225";

	public List<Employee> findAllEmployee() {

		//code to return all employees  in employee table



		List<Employee> employees=new ArrayList<Employee>();

		try {
			Class.forName(dbDriver);

			Connection con=DriverManager.getConnection(url,uname,pwd);

			Statement st=con.createStatement();

			ResultSet rs=st.executeQuery("select * from EmpManagement");

			while(rs.next())
			{

				String id=rs.getString(1);	
				String name=rs.getString(2);
				double sal=rs.getDouble(3);
				int ex=rs.getInt(4);	

				Employee employee=new Employee(id,name,sal,ex);

				employees.add(employee);
			}
			st.close();
			rs.close();
			con.close();
		}
		catch (Exception e) {

			e.printStackTrace();
		}

		return employees;
	}


	public void insertEmployee(Employee employee)  {

		//String query="insert into empmanagement values('"+employee.getEmpid()+"' , '"+employee.getEmpName()+"' , "+employee.getEmpSal()+" , "+employee.getExperience()+")"; 

		//		String query="insert into empmanagement values(?,?,?,?)";
		//		
		//		System.out.println("query is: "+query);
		//		
		//		jdbcTemplet.update(query,employee.getEmpid(),employee.getEmpName(),employee.getEmpSal(),employee.getExperience());

		Connection con = null;

		try {

			//create class path

			Class.forName(dbDriver);

			//System.out.println("Driver loaded....");

			//Create connection

			con=DriverManager.getConnection(url,uname,pwd);

			//System.out.println("Database connected....");

			//create statement
			PreparedStatement st=con.prepareStatement("insert into empManagement values(?,?,?,?)");

			//Reading table name
			Scanner sc=new Scanner(System.in);

			while(true) {
				System.out.println("Enter Emp No:");
				String id=sc.next();
				System.out.println("Enter Emp Name:");
				String name=sc.next();
				System.out.println("Enter Emp Salary: ");
				double sal=sc.nextDouble();
				System.out.println("Enter Emp Experience:");
				int ex=sc.nextInt();

				//sc.close();		// don't close scanner connection because of input data

				st.setString(1, id);
				st.setString(2, name);
				st.setDouble(3, sal);
				st.setInt(4, ex);

				int count=st.executeUpdate();
				if(count>0)
					System.out.println(count+" record inserted....");
				else
					System.out.println("no record inserted...");

				System.out.println("Do you want to insert more records...");

				String ch=sc.next();
				if(ch.equalsIgnoreCase("no"))
					break;

			}
			con.close();

		}
		catch(Exception e) {

			System.out.println("Exception: "+e);
		}
		finally {
			System.out.println("Connection closed...");

		}
	}

	public void updateEmployee(Employee employee) {
		System.out.println("Update choosing  Records: ");

	}
}

//	@Override
//	public Employee getEmployeeById(String id) {
//
//		Employee emp=new Employee();
//
//		try {
//			
//		Class.forName(dbDriver);
//
//		Connection con=DriverManager.getConnection(url,uname,pwd);
//
//		Statement st=con.createStatement();
//
//		
//		ResultSet rs=st.executeQuery("select * from EmpManagement where empid="+id);
//
//		while(rs.next())
//		{
//			emp.setEmpid(rs.getString(1));
//			emp.setEmpName(rs.getString(2));
//			emp.setEmpSal(rs.getDouble(3));
//			emp.setExperience(rs.getInt(4));
//			
//		}
//		st.close();
//		rs.close();
//		con.close();
//	}
//	catch (Exception e) {
//
//		e.printStackTrace();
//	}
//
//	return emp;
//
//		
//	}

