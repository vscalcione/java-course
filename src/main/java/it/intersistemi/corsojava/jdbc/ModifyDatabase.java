package it.intersistemi.corsojava.jdbc;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;
import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class ModifyDatabase {

    public String jdbcDriverClass;
    public String jdbcUrl;
    public String username;
    public String password;
    public String searchedValue;
    public String query;

    public void initializeMenu(){
        System.out.println("1. Select Query ");
        System.out.println("2. Insert Query ");
        System.out.println("3. Drop Query ");
        System.out.println("4. Delete Query ");
        System.out.println("5. Update Query ");
    }
    public void selectQuery(String tableName) throws ClassNotFoundException, IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String jdbcDriverClass = "org.h2.Driver";
        Class.forName(jdbcDriverClass);
        jdbcUrl = "jdbc:h2:~/test";
        username = "sa";
        password = "";
        query = "SELECT * FROM " + tableName + "WHERE NOME = ? ";
        try(Connection jdbcConnection = DriverManager.getConnection(jdbcUrl, username, password);
            PreparedStatement prst = jdbcConnection.prepareStatement(query);
        ){
            System.out.println("*******************************");
            System.out.println("Successfull Connection with datasource at: " + jdbcUrl);
            System.out.println("Query to execute: " + query);
            searchedValue = ConsoleInputString.readString(console, "Value to search: ");
            prst.setString(1, searchedValue);
            ResultSet result = prst.executeQuery();
            if(result.next()){
                System.out.println("Column1: " + result.getString(1) + "| Column2: " + result.getString(2));
            }else{
                System.out.println("FATAL ERROR **** Record not found ");
            }
            System.out.println("Connection with datasource terminated ");
            System.out.println("**************************************");
        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }
    public void insertQuery(String tableName) throws ClassNotFoundException, IOException{}
    public void dropQuery (String tableName) throws ClassNotFoundException, IOException{}
    public void deleteQuery(String tableName) throws ClassNotFoundException, IOException{}
    public void updateQuery(String tableName) throws ClassNotFoundException, IOException{}

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String tableName;
        String choice;
        ModifyDatabase modifierDB = new ModifyDatabase();
        int choiceQueryType;
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        do{
            do{
                choiceQueryType = ConsoleInputInt.readInt(console, "Press 1 - 4 to choose query type: ");
                if(choiceQueryType < 1 || choiceQueryType > 5){
                    System.out.println("Error");
                }
            }while(choiceQueryType < 1 || choiceQueryType > 5);
            switch (choiceQueryType){
                case 1:
                    tableName = ConsoleInputString.readString(console, "Insert table name: ");
                    modifierDB.selectQuery(tableName);
                case 2:
                    tableName = ConsoleInputString.readString(console, "Insert table name: ");
                    modifierDB.insertQuery(tableName);
                case 3:
                    tableName = ConsoleInputString.readString(console, "Insert table name: ");
                    modifierDB.dropQuery(tableName);
                case 4:
                    tableName = ConsoleInputString.readString(console, "Insert table name: ");
                    modifierDB.deleteQuery(tableName);
                case 5:
                    tableName = ConsoleInputString.readString(console, "Insert table name: ");
                    modifierDB.updateQuery(tableName);
            }
            choice = ConsoleInputString.readString(console, "Do you execute another query? ");
            if(!(choice.equals("no") && choice.equals("yes"))){
                System.out.println("Error");
            }
        }while(choice.equals("yes"));
    }
}
