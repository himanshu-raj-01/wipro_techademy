package HR;

import java.sql.*;

public class UpdateData_JDBC {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee_db",
                    "root",
                    "himanshu.1"
            );

            Statement stmt = con.createStatement();

            String updateQuery =
                    "UPDATE employee_details " +
                    "SET Salary = 65000, Location = 'Bangalore' " +
                    "WHERE Employee_ID = 102";

            int rows = stmt.executeUpdate(updateQuery);

            System.out.println(rows + " record(s) updated successfully");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
