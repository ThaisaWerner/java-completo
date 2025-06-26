package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RetrievePeople1 {

    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM people";

        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        List<Person> people = new ArrayList<>();

        while(result.next()) {
            int id = result.getInt("id");
            String name = result.getString("name");
            people.add(new Person(id, name));
        }

        for(Person p : people) {
            System.out.println(p.getId() + " ---> " + p.getName());
        }

        connection.close();
    }
}
