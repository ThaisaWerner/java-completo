package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RetrievePeople2 {
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the letters: ");
        String letter = scanner.nextLine();

        Connection connection = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM people WHERE name LIKE ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, "%" + letter + "%");
        ResultSet result = stmt.executeQuery();

        List<Person> people = new ArrayList<>();

        while(result.next()) {
            int id = result.getInt("id");
            String name = result.getString("name");
            people.add(new Person(id, name));
        }

        for(Person p : people) {
            System.out.println(p.getId() + " ---> " + p.getName());
        }

        scanner.close();
        connection.close();
    }
}
