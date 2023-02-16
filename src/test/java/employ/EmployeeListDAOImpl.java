package employ;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class EmployeeListDAOImpl {

    private static final String HOST = "jdbc:mysql://localhost:3306/employee";
    private static final String USER = "root";
    private static final String PASS = "Gh1372165509";
    private static final String INSERT_SQL = "INSERT INTO ITEM(name, quantity) VALUES(?, ?)";
    private static final String SELECT_SQL = "SELECT * FROM ITEM ORDER BY id DESC limit 1";
    private static final String DELETE_SQL = "DELETE FROM ITEM ORDER BY id DESC limit 1";
    private static final String ERROR = "connection to database is impossible";

    @Test
    void name() {
        try(Connection coni = DriverManager.getConnection(HOST, USER, PASS)) {
            if (coni == null)
            Assertions.fail(ERROR);
        } catch (SQLException e) {
            e.printStackTrace();
            Assertions.fail(ERROR);

        }
    }

    @Test
    void name1() {
        try(Connection coni = DriverManager.getConnection(HOST, USER, PASS);
            PreparedStatement insert = coni.prepareStatement(INSERT_SQL);
            PreparedStatement select = coni.prepareStatement(SELECT_SQL);
            PreparedStatement delete = coni.prepareStatement(DELETE_SQL)) {

            insert.setString(1, "Orange");
            insert.setInt(2, 5);
            insert.executeUpdate();

            ResultSet resultSet = select.executeQuery();

            while (resultSet.next()){
                String name = resultSet.getString("name");
                int quantity = resultSet.getInt("quantity");
                Assertions.assertThat(name).isEqualTo("Orange");
                Assertions.assertThat(quantity).isEqualTo(5);
            }

            delete.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
}
