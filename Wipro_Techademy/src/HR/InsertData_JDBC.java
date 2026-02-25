package HR;

import java.sql.*;

public class InsertData_JDBC {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee_db",
                    "root",
                    "himanshu.1"
            );

            Statement stmt = con.createStatement();

            String insertQuery =
                    "INSERT INTO employee_details VALUES " +
                    "(101, 'Rahul', 10, 50000, 'Mumbai')," +
                    "(102, 'Anita', 20, 60000, 'Delhi')," +
                    "(103, 'Suresh', 30, 55000, 'Pune')";

            stmt.executeUpdate(insertQuery);

            System.out.println("Data inserted successfully");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
