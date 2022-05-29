package JDBC_Package;

import java.sql.*;

public class JDBC_4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver="com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/demo";//demo is database names
        String uname = "root";
        String uPassword = "root";
        String query="update employees set first_name= 'Steve' where id=6";
        Class.forName(driver);
        Connection con= DriverManager.getConnection(url,uname,uPassword);
        Statement stm=con.createStatement();
        stm.executeUpdate(query);
        stm.close();
        con.close();
    }
}
