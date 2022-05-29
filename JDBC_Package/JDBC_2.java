package JDBC_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_2 {
    public static void main(String[] args) throws Exception {
        String driver="com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/demo";//demo is database names
        String uname = "root";
        String uPassword = "root";
        String query = "select * from employees";//employees is the table name
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url,uname,uPassword);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);// ResultSet store the data as well as schema actualy it look like perfect result

        while (rs.next()) {
            System.out.print(rs.getInt("id") + " ");
            System.out.print(rs.getString("first_name") + " ");
            System.out.println(rs.getString("last_name") + " ");
        }

        st.close();
        con.close();
    }
}
