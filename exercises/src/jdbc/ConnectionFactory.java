package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3307?verifyServerCertificate=false&useSSL=true";
            String user = "root";
            String password = "@Thai1995";

            //Connecting to the database
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
