package it.intersistemi.corsojava.jdbc;

import java.sql.*;

public class JdbcConnectionMain {

    public static void main(String[] args) throws ClassNotFoundException {
        String jdbcDriverClass = "org.h2.Driver";
        Class.forName(jdbcDriverClass);
        String jdbcUrl = "jdbc:h2:~/test";
        String username = "sa";
        String password = "";

        try(Connection jdbcConnection = DriverManager.getConnection(jdbcUrl, username, password);
            Statement stm = jdbcConnection.createStatement()
        ) {
            System.out.println("Successfully Connected \n");
            Thread.sleep(500);
            String query = "SELECT * FROM AUTO ORDER BY NOME";
            ResultSet result = stm.executeQuery(query);
            System.out.println(" ********* TABLE AUTO ********* ");
            while(result.next()){
                System.out.println("ID: " + result.getString(4) + ", PROVINCIA: "
                        + result.getString(1) + ", Name: " + result.getString(4));
            }
            System.out.println(" ********* END TABLE ************ ");

            //Another Table
            query = "SELECT * FROM VIGILE";
            result = stm.executeQuery(query);
            System.out.println("********** TABLE VIGILE *********** ");
            while(result.next()){
                System.out.println("ID: " + result.getString(1) + ", Name: " + result.getString(2) + ", Surname: "
                        + result.getString(3));
            }

        } catch (SQLException | InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
