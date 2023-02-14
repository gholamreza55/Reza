package tamrin;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class TeDAOtest {

    private static final String HOST = "jdbc:mysql://localhost:3306/dao";
    private static final String USER = "root";
    private static final String PASS = "Gh1372165509";
    private static final String INSERT_SQL = "INSERT INTO ITEM(id, name) VALUES (?, ?)";
    private static final String ERROR = "sql immpossible";
    private static final String SELECT_SQL = "SELECT * FROM ITEM ORDER BY customer_id DESC limit 1";
    private static final String DELETE_SQL = "DELETE FROM ITEM ORDER BY customer_id DESC limit 1";

    @Test
    void name() {
        try(Connection co = DriverManager.getConnection(HOST, USER, PASS)){
            Assertions.fail(ERROR);

        } catch (SQLException e) {
            e.printStackTrace();
            Assertions.fail(ERROR);

        }
    }

    @Test
    void name1() {
        try(Connection co = DriverManager.getConnection(HOST, USER, PASS);
            PreparedStatement insert = co.prepareStatement(INSERT_SQL);
            PreparedStatement select = co.prepareStatement(SELECT_SQL);
            PreparedStatement delete = co.prepareStatement(DELETE_SQL)) {
            insert.setInt(1, 2);
            insert.setString(2, "gholamreza");
            insert.executeUpdate();

            ResultSet resultSet = select.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");

            }
            delete.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            Assertions.fail(ERROR);

        }
    }
}
