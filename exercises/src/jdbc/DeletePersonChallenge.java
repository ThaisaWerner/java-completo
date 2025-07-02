package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePersonChallenge {
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        String loop = "";

        while(!loop.equals("exit")) {

            System.out.println("Insert the name or type exit to exit:");
            loop = scanner.nextLine();
            //String name = scanner.nextLine();
            Connection connection = ConnectionFactory.getConnection();

            String select = "SELECT id, name FROM people WHERE name LIKE ?";
            PreparedStatement stmt = connection.prepareStatement(select);
            stmt.setString(1, "%" + loop + "%");
            ResultSet result = stmt.executeQuery();

            if(result.next()) {
                Person person = new Person(result.getInt(1), result.getString(2));
                System.out.println("Do you want to delete: " + person.getName());
                System.out.println("Type 1 ---> Yes or 2 ---> No");
                int answer = scanner.nextInt();

                if(answer == 1) {
                    stmt.close();
                    String delete = "DELETE FROM people WHERE id = ?";
                    stmt = connection.prepareStatement(delete);
                    stmt.setInt(1, person.getId());
                    stmt.execute();

                    System.out.println(person.getName() + " deleted successfully");
                } else {
                    System.out.println(person.getName() + " not deleted");
                    System.out.println("Do you want to delete another person?");
                    System.out.println("Type 1 ---> Yes or 2 ---> No");

                    int endLoop = scanner.nextInt();

                    if(endLoop == 2) {
                        break;
                    } else {
                        scanner.nextLine();
                    }
                }
            } else {
                System.out.println("Person not found");
            }
        }
    }





}
