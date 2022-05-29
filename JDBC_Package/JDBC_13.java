package JDBC_Package;

import java.sql.*;

public class JDBC_13 {
    public static void main(String[] args) throws SQLException {

        String catalog = null;
        String schemaPattern = null;
        String tableNamePattern = null;
        String columnNamePattern = null;
        String[] types = null;

        Connection myConn = null;
        ResultSet myRs = null;

        try {
            String url = "jdbc:mysql://localhost:3306/showroom";//demo is database names
            String uname = "root";
            String uPassword = "root";
            // 1. Get a connection to database
            myConn = DriverManager.getConnection(url,uname,uPassword);

            // 2. Get metadata
            DatabaseMetaData databaseMetaData = myConn.getMetaData();

            // 3. Get list of tables
            System.out.println("List of Tables");
            System.out.println("--------------");

            myRs = databaseMetaData.getTables(catalog, schemaPattern, tableNamePattern,types);

            while (myRs.next()) {
                System.out.println(myRs.getString("TABLE_NAME"));
            }

            // 4. Get list of columns
            System.out.println("\n\nList of Columns");
            System.out.println("--------------");

            myRs = databaseMetaData.getColumns(catalog, schemaPattern, "brands", columnNamePattern);

            while (myRs.next()) {
                System.out.println(myRs.getString("COLUMN_NAME"));
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            close(myConn, myRs);
        }
    }

    private static void close(Connection myConn, ResultSet myRs)
            throws SQLException {

        if (myRs != null) {
            myRs.close();
        }

        if (myConn != null) {
            myConn.close();
        }
    }

}
