package JDBC_Package;

import javax.xml.transform.Result;
import java.sql.*;

public class JDBC_12 {
    public static void main(String[] args) throws SQLException {
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Register the driver

            String url = "jdbc:mysql://localhost:3306/showroom";//demo is database names
            String uname = "root";
            String uPassword = "root";

            con= DriverManager.getConnection(url,uname,uPassword);//Establish Connection
            st=con.createStatement();
            rs= st.executeQuery("select * from brands");
            ResultSetMetaData rsM=rs.getMetaData();
            int columCount= rsM.getColumnCount();
            for(int i=1;i<=columCount;i++)
            {
                System.out.println("Column Name: "+rsM.getColumnName(i));
                System.out.println("Column Type: "+ rsM.getColumnType(i));
                System.out.println("Column Type Name: "+ rsM.getColumnTypeName(i));
                int k= rsM.isNullable(i);
                if(k==0)
                    System.out.println("Is Nullable?:  NO");
                else
                    System.out.println("Is Nullable?:  Yes");

                System.out.println();
                System.out.println();

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
