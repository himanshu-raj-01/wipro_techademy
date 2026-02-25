package HR;

import java.sql.*;

public class FetchData_JDBC {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "himanshu.1");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee_details");

            System.out.printf(
                    "%-12s %-15s %-10s %-12s %-15s%n",
                    "ID", "Name", "Dept_ID", "Salary", "Location"
            );

            System.out.println("-----------------------------------------------------------");

            // Data rows
            while (rs.next()) {
                System.out.printf("%-12d %-15s %-10d %-12.2f %-15s%n", rs.getInt("Employee_ID"), rs.getString("Name"), rs.getInt("Dept_ID"),rs.getDouble("Salary"),rs.getString("Location")
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
