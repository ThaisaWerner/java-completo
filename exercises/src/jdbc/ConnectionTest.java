package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3307?verifyServerCertificate=false&useSSL=true";
        String user = "root";
        String password = "@Thai1995";

        //Connecting to the database
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("Connection successful");
        connection.close();
    }
}
