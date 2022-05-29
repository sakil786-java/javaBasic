package JDBC_Package;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

//Database MetaData
public class JDBC_8 {
    public static void main(String[] args) throws SQLException {

        Connection myConn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/demo";//demo is database names
            String uname = "root";
            String uPassword = "root";
            // 1. Get a connection to database
            myConn = DriverManager.getConnection(url,uname,uPassword);
            // 2. Get metadata
            DatabaseMetaData databaseMetaData = myConn.getMetaData();

            // 3. Display info about database
            System.out.println("Product name: " + databaseMetaData.getDatabaseProductName());
            System.out.println("Product version: " + databaseMetaData.getDatabaseProductVersion());
            System.out.println();

            // 4. Display info about JDBC Driver
            System.out.println("JDBC Driver name: " + databaseMetaData.getDriverName());
            System.out.println("JDBC Driver version: " + databaseMetaData.getDriverVersion());

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            close(myConn);
        }
    }

    private static void close(Connection myConn)
            throws SQLException {

        if (myConn != null) {
            myConn.close();
        }
    }

}
