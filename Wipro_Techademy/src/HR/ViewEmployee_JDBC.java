package HR;

import java.sql.*;

public class ViewEmployee_JDBC {

    public static void main(String[] args) {

        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee_db",
                    "root",
                    "himanshu.1"
            );

            Statement stmt = con.createStatement();

            /* ======================================================
               1. SELECT * FROM Employee
            ====================================================== */
            System.out.println("\n--- All Employees ---");

            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");

            System.out.printf(
                    "%-5s %-12s %-12s %-8s %-5s %-12s %-15s %-10s %-10s%n",
                    "ID", "FirstName", "LastName", "Gender", "Age",
                    "Address", "Mobile", "Dept", "Salary"
            );

            System.out.println("--------------------------------------------------------------------------------------------");

            while (rs.next()) {
                System.out.printf(
                        "%-5d %-12s %-12s %-8s %-5d %-12s %-15s %-10s %-10d%n",
                        rs.getInt("Employee_ID"),
                        rs.getString("First_Name"),
                        rs.getString("Last_Name"),
                        rs.getString("Gender"),
                        rs.getInt("Age"),
                        rs.getString("Address"),
                        rs.getString("Mobile_Number"),
                        rs.getString("Dept"),
                        rs.getInt("Salary")
                );
            }

            /* ======================================================
               2. SELECT First_Name, Last_Name, Salary
            ====================================================== */
            System.out.println("\n--- Employee Name and Salary ---");

            rs = stmt.executeQuery(
                    "SELECT First_Name, Last_Name, Salary FROM Employee"
            );

            System.out.printf("%-12s %-12s %-10s%n", "FirstName", "LastName", "Salary");

            while (rs.next()) {
                System.out.printf(
                        "%-12s %-12s %-10d%n",
                        rs.getString("First_Name"),
                        rs.getString("Last_Name"),
                        rs.getInt("Salary")
                );
            }

            /* ======================================================
               3. Employees with Salary > 100000
            ====================================================== */
            System.out.println("\n--- Employees with Salary > 100000 ---");

            rs = stmt.executeQuery(
                    "SELECT * FROM Employee WHERE Salary > 100000"
            );

            while (rs.next()) {
                System.out.println(
                        rs.getString("First_Name") + " " +
                        rs.getString("Last_Name") + " - " +
                        rs.getInt("Salary")
                );
            }

            /* ======================================================
               4. COUNT(*)
            ====================================================== */
            System.out.println("\n--- Total Employee Count ---");

            rs = stmt.executeQuery("SELECT COUNT(*) AS total FROM Employee");

            if (rs.next()) {
                System.out.println("Total Employees: " + rs.getInt("total"));
            }

            /* ======================================================
               5. MAX(Salary)
            ====================================================== */
            System.out.println("\n--- Maximum Salary ---");

            rs = stmt.executeQuery("SELECT MAX(Salary) AS max_salary FROM Employee");

            if (rs.next()) {
                System.out.println("Max Salary: " + rs.getInt("max_salary"));
            }

            /* ======================================================
               6. Employee with Maximum Salary
            ====================================================== */
            System.out.println("\n--- Employee with Highest Salary ---");

            rs = stmt.executeQuery(
                    "SELECT First_Name, Last_Name, Salary " +
                    "FROM Employee " +
                    "WHERE Salary = (SELECT MAX(Salary) FROM Employee)"
            );

            while (rs.next()) {
                System.out.println(
                        rs.getString("First_Name") + " " +
                        rs.getString("Last_Name") +
                        " earns " + rs.getInt("Salary")
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
