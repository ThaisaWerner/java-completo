package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3307?verifyServerCertificate=false&useSSL=true";
        String user = "root";
        String password = "@Thai1995";

        //Connecting to the database
        Connection connection = DriverManager.getConnection(url, user, password);

        Statement stmt = connection.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS java_course");

        connection.close();
    }
}
