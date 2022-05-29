package JDBC_Package;

import java.sql.*;
import java.util.Scanner;

//Transaction in Database
public class JDBC_7 {

    public static void main(String[] args) throws SQLException {

            Connection myConn = null;
            Statement myStmt = null;

            try {

                String url = "jdbc:mysql://localhost:3306/demo";//demo is database names
                String uname = "root";
                String uPassword = "root";
                // 1. Get a connection to database
                myConn = DriverManager.getConnection(url,uname,uPassword);

                // Turn off auto commit
                myConn.setAutoCommit(false);

                // Show salaries BEFORE
                System.out.println("Salaries BEFORE\n");
                showSalaries(myConn, "Engineering");

                // Transaction Step 1: Set salaries to 300000 for all Engineering employees
                myStmt = myConn.createStatement();

                myStmt.executeUpdate("update employees set salary=300000 where department='Engineering'");

                System.out.println("\n>> Transaction steps are ready.\n");

                // Ask user if it is okay to save
                boolean ok = askUserIfOkToSave();//this function is in the last

                if (ok) {
                    // store in database
                    myConn.commit();
                    System.out.println("\n>> Transaction COMMITTED.\n");
                } else {
                    // discard
                    myConn.rollback();
                    System.out.println("\n>> Transaction ROLLED BACK.\n");
                }

                // Show salaries AFTER
                System.out.println("Salaries AFTER\n");
                showSalaries(myConn, "Engineering");

            } catch (Exception exc) {
                exc.printStackTrace();
            } finally {
                close(myConn, myStmt, null);
            }
        }

        /**
         * Prompts the user. Return true if they enter "yes", false otherwise
         *
         *
         */
        private static boolean askUserIfOkToSave() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Is it okay to save?  yes/no: ");
            String input = scanner.nextLine();

            scanner.close();

            return input.equalsIgnoreCase("yes");
        }

        private static void showSalaries(Connection myConn, String theDepartment) throws SQLException {
            PreparedStatement myStmt = null;
            ResultSet myRs = null;

            System.out.println("Show Salaries for Department: " + theDepartment);

            try {
                // Prepare statement
                myStmt = myConn.prepareStatement("select * from employees where department=?");

                myStmt.setString(1, theDepartment);

                // Execute SQL query
                myRs = myStmt.executeQuery();

                // Process result set
                while (myRs.next()) {
                    String firstName = myRs.getString("first_name");
                    String lastName = myRs.getString("last_name");
                    double salary = myRs.getDouble("salary");
                    String department = myRs.getString("department");

                    System.out.printf("%s, %s, %s, %.2f\n",firstName , lastName, department, salary);
                }

                System.out.println();
            } catch (Exception exc) {
                exc.printStackTrace();
            } finally {
                close(myStmt, myRs);
            }

        }

        private static void close(Connection myConn, Statement myStmt, ResultSet myRs) throws SQLException {
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

        private static void close(Statement myStmt, ResultSet myRs)
            throws SQLException {

            close(null, myStmt, myRs);
        }
    }
