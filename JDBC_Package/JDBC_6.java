package JDBC_Package;

import java.sql.*;
import java.util.Scanner;

//Prepared Statement Use 2 by using ' ? '
public class JDBC_6 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/demo";//demo is database names
        String uname = "root";
        String uPassword = "root";
        String query="select * from employees where salary> ? and department= ?";
        Class.forName(driver);
        Connection con= DriverManager.getConnection(url,uname,uPassword);
        PreparedStatement pst=con.prepareStatement(query);
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Employee salary: ");
        int salary=sc.nextInt();
        System.out.println("Enter Employee department: ");
        String department=sc.next();
        pst.setDouble(1,salary);
        pst.setString(2,department);


        ResultSet rs =pst.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getInt("id") + "   ");
            System.out.print(rs.getString("first_name") + "   ");
            System.out.print(rs.getString("last_name") + "   ");
            System.out.print(rs.getString("email") + "   ");
            System.out.print(rs.getString("department") + "   ");
            System.out.println(rs.getInt("salary") + "   ");
        }
        pst.close();
        con.close();
    }
}

