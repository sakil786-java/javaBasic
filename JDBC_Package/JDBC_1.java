package JDBC_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_1 {
    public static void main(String[] args) throws Exception {
        String driver="com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/showroom";
        String uname = "root";
        String uPassword = "root";
        String query = "select * from brands";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url,uname,uPassword);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);// ResultSet store the data as well as schema actualy it look like perfect result

        while (rs.next()) {
            System.out.print(rs.getInt("brandId") + " ");
            System.out.println(rs.getString("brandName") + " ");
        }

        st.close();
        con.close();
    }
}
