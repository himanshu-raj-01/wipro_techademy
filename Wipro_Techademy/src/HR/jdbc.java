package HR;

import java.sql.*;

public class jdbc {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "himanshu.1");

            // CallableStatement
            CallableStatement cstmt = con.prepareCall("{CALL getAllEmployees()}");

            ResultSet rs = cstmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("Employee_ID") + " " + rs.getString("Name"));
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
