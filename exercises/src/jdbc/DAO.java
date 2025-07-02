package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Creating um DAO to encapsulate the inclusion process
public class DAO {

    private Connection connection;

    public int include(String sql, Object... attributes) {
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            addAttributes(stmt, attributes);

            if(stmt.executeUpdate() > 0) {
                ResultSet result = stmt.getGeneratedKeys();

                if(result.next()) {
                    return result.getInt(1);
                }
            }

            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            getConnection().close();
        } catch (SQLException e) {

        } finally {
            connection = null;
        }
    }

    private void addAttributes(PreparedStatement stmt, Object[] attributes) throws SQLException {
        int index = 1;
        for(Object attribute : attributes) {
            if(attribute instanceof String) {
                stmt.setString(index, (String)attribute);
            } else if(attribute instanceof Integer) {
                stmt.setInt(index, (Integer) attribute);
            }

            index++;
        }
    }

    private Connection getConnection() {
        try {
            if(connection != null | !connection.isClosed()) {
                return connection;
            }
        } catch (SQLException e) {

        }
        connection = ConnectionFactory.getConnection();
        return connection;
    }
}
