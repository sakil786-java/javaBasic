package JDBC_Package;

import java.sql.*;

public class JDBC_11 {
    public static void main(String[] args) throws SQLException {
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Register the driver

            String url = "jdbc:mysql://localhost:3306/demo";//demo is database names
            String uname = "root";
            String uPassword = "root";

             con= DriverManager.getConnection(url,uname,uPassword);//Establish Connection
             st=con.createStatement();
             rs= st.executeQuery("select * from employees");

            while(rs.next())
            {
                System.out.println("Email: "+rs.getString(4)+"<--------> Department : "+rs.getString(5));
            }



        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        finally {
           close(st,con,rs);
        }

    }
    private static void close(Statement st,Connection con,ResultSet rs) throws SQLException {
        if(st!=null)
            st.close();

        if(con!=null)
            con.close();

        if(rs!=null)
            rs.close();
    }

}
