package shop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.*;

import static java.sql.DriverManager.*;
import static org.junit.jupiter.api.Assertions.*;

public class ShopingListDAOImpl {

    private static final String HOST = "jdbc:mysql://localhost:3306/shop";
    private static final String USER = "root";
    private static final String PASS = "Gh1372165509";
    private static final String ERROR = "connection to database is impossible";
    private static final String INSERT_SQL = "INSERT INTO ITEM(name, quantity) VALUES (?, ?)";
    private static final String SELECT_SQL = "SELECT * FROM item ORDER BY id DESC limit 1";
    private static final String DELETE_SQL = "DELETE FROM item ORDER BY id DESC limit 1";

    @Test
    void should_connect_to_mySql_Database() {
      //  DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "Gh1372165509");
        try (final Connection con = getConnection(HOST, USER, PASS)){

            if (con == null){
               // Assertions.fail("connection to database is impossible");
            Assertions.fail(ERROR);
            }
        } catch (SQLException e) {
            e.printStackTrace();
             Assertions.fail(ERROR);

        }
    }

    @Test
    void should_insert_read_and_delete_a_item_in_database() {
        try (final Connection con = getConnection(HOST, USER, PASS);
             PreparedStatement insert = con.prepareStatement(INSERT_SQL);
             PreparedStatement select = con.prepareStatement(SELECT_SQL);
             PreparedStatement delete = con.prepareStatement(DELETE_SQL)){
            
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
            Assertions.fail(ERROR);

        }
    }
}
