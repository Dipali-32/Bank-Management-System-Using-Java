package bank.management.system;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {
    Connection connection;
    Statement statement;
    //constructure
    public Con(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Mysql@123");
            statement= connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
