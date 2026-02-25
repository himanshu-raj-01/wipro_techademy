package HR;

import java.sql.*;

public class CreateTable_JDBC {

    public static void main(String[] args) {

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee_db",
                    "root",
                    "himanshu.1"
            );

            Statement stmt = con.createStatement();
            
            String createTableQuery =
                    "CREATE TABLE employee_details (" +
                    "Employee_ID INT PRIMARY KEY, " +
                    "Name VARCHAR(50), " +
                    "Dept_ID INT, " +
                    "Salary DOUBLE, " +
                    "Location VARCHAR(50)" +
                    ")";

            stmt.executeUpdate(createTableQuery);

            System.out.println("Table employee_details created successfully");
            
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
