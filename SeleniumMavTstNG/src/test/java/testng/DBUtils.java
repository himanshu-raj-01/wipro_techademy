package testng;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {

	public static Object[][] getDBData() throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "himanshu.1";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
        String query = "SELECT username, password FROM login_data";
        
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        List<Object[]> dataList = new ArrayList<>();
        
        while (rs.next()) {
        	String uname = rs.getString("username");
        	String pass = rs.getString("password");
        	
        	dataList.add(new Object[]{uname, pass});
        }
        
        rs.close();
        stmt.close();
        con.close();
        
        Object[][] data = new Object[dataList.size()][2];
        
        for (int i = 0; i < dataList.size(); i++) {
        	data[i] = dataList.get(i);
        }
		
		return data;
	}

}
