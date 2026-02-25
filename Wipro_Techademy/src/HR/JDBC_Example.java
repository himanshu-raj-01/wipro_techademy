package HR;

import java.sql.*;

public class JDBC_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //It is a static method of the Class class used to load a class dynamically at runtime
			
			//establishing a connection with the databases
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "himanshu.1");
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(" select * from employees");
			
            System.out.println("ID  Name  Dept_ID  Salary  Location");

			
			while (rs.next())
			{
				System.out.println(
				        rs.getInt("Employee_ID") + " " +
				        rs.getString("Name") + " " +
				        rs.getString("Dept_ID") + " " +
				        rs.getDouble("Salary") + " " +
				        rs.getString("Location")
				    );
			}
			con.close();
		}
			catch(Exception e)
		{
				System.out.println(e);
		}
	}
}
