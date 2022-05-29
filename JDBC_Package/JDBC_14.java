package JDBC_Package;

import java.sql.*;

public class JDBC_14 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver="com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        String url = "jdbc:mysql://localhost:3306/showroom";//demo is database names
        String uname = "root";
        String uPassword = "root";
        Connection con= DriverManager.getConnection(url,uname,uPassword);
        Statement stm= con.createStatement();
        ResultSet rs=stm.executeQuery("select * from brands");
        ResultSetMetaData rsm=rs.getMetaData();
        System.out.println("Table name: "+rsm.getTableName(1));

    }

}
