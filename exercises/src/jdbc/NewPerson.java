package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NewPerson {
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the name: ");
        String name = scanner.nextLine();

        Connection connection = ConnectionFactory.getConnection();

        String sql = "INSERT INTO people (name) VALUES (?)";
        //Guarantee that a sql injection won't be made
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, name);

        stmt.execute();

        System.out.println("Person added successfully");
        scanner.close();

    }
}
