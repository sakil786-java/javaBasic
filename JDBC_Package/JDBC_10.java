package JDBC_Package;
//ResulSet Meta Data  Give information about result
import java.sql.*;

public class JDBC_10 {
    public static void main(String[] args) throws SQLException {

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            String url = "jdbc:mysql://localhost:3306/demo";//demo is database names
            String uname = "root";
            String uPassword = "root";
            // 1. Get a connection to database
            myConn = DriverManager.getConnection(url,uname,uPassword);
            // 2. Run query
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select id, last_name, first_name, salary,department from employees");

            // 3. Get result set metadata
            ResultSetMetaData rsMetaData = myRs.getMetaData();

            // 4. Display info
            int columnCount = rsMetaData.getColumnCount();
            System.out.println("Column count: " + columnCount + "\n");

            for (int column=1; column <= columnCount; column++) {
                System.out.println("Column name: " + rsMetaData.getColumnName(column));
                System.out.println("Column type name: " + rsMetaData.getColumnTypeName(column));
                int k= rsMetaData.isNullable(column);
                if(k==0)
                    System.out.println("Is Nullable?:  NO");
                else
                    System.out.println("Is Nullable?:  Yes");
                System.out.println("Is Auto Increment: " + rsMetaData.isAutoIncrement(column) + "\n");
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            close(myConn, myStmt, myRs);
        }
    }

    private static void close(Connection myConn, Statement myStmt, ResultSet myRs)
            throws SQLException {

        if (myRs != null) {
            myRs.close();
        }

        if (myStmt != null) {
            myStmt.close();
        }

        if (myConn != null) {
            myConn.close();
        }
    }

}