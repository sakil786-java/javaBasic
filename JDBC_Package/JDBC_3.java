package JDBC_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_3 {
    public static void main(String[] args) throws Exception {
        String driver="com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/demo";//demo is database names
        String uname = "root";
        String uPassword = "root";
        String query = "insert into employees values(13,'Laskar','Sakil','Sakil.laskar@globalid','HR',50000)";//employees is the table name
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url,uname,uPassword);
        Statement st = con.createStatement();
        st.executeUpdate(query);// ResultSet store the data as well as schema actualy it look like perfect result

        st.close();
        con.close();
    }
}
