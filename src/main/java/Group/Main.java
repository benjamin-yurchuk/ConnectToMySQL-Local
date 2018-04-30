package Group;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static final String HOST = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7235535";
    private static final String USERNAME = "sql7235535";
    private static final String PASSWORD = "5XrrWXrhHr";

    public static void main(String[] args) {

        Connection connection;

        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);

        }catch (SQLException e){

            e.printStackTrace();
        }

    }

}
