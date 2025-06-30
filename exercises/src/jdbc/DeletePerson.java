package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePerson {
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the id:");
        int id = scanner.nextInt();

        Connection connection = ConnectionFactory.getConnection();
        String sql = "DELETE FROM people WHERE id = ?";

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, id);

        int counter = stmt.executeUpdate();
        if(counter > 0) {
            System.out.println("Person deleted");
        } else {
            System.out.println("No data deleted");
        }
        System.out.println("Rows affected: " + counter);

        connection.close();
        scanner.close();
    }
}
