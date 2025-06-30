package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePersonName {
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the id: ");
        int id = scanner.nextInt();

        Connection connection = ConnectionFactory.getConnection();

        String select = "SELECT id, name FROM people WHERE id = ?";

        PreparedStatement stmt = connection.prepareStatement(select);
        stmt.setInt(1, id);
        ResultSet result = stmt.executeQuery();

        //If has a result
        if(result.next()) {
            Person person = new Person(result.getInt(1), result.getString(2));
            System.out.println("The name selected is " + person.getName());
            scanner.nextLine();

            System.out.println("Insert the new name: ");
            String name = scanner.nextLine();

            String update = "UPDATE people SET name = ? WHERE id = ?";

            stmt.close();
            stmt = connection.prepareStatement(update);
            stmt.setString(1, name);
            stmt.setInt(2, id);
            stmt.execute();

            System.out.println("Name updated!");
        } else {
            System.out.println("Person not found");
        }

        scanner.close();
        connection.close();
    }
}
