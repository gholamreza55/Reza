package shop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class ShopingListDAOImpl implements ShoppingListDAO{


    private static final String HOST = "jdbc:mysql://localhost:3306/shop";
    private static final String USER = "root";
    private static final String PASS = "Gh1372165509";
    private static final String INSERT_SQL = "INSERT INTO ITEM(name, quantity) VALUES (?, ?)";
    private static final String SELECT_SQL = "SELECT * FROM item";


    @Override
    public List<Item> findAllItems() {

        List<Item>items = new LinkedList<>();
        try (final Connection con = getConnection(HOST, USER, PASS);
             PreparedStatement select = con.prepareStatement(SELECT_SQL)){

            select.executeQuery();
            ResultSet resultSet = select.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                int quantity = resultSet.getInt("quantity");
                items.add(new Item(name, quantity));
            }
        } catch (SQLException e) {
            throw new MainaSqlException(e);
        }
        return items;
    }

    @Override
    public void saveItem(List<Item> items) {
        try (final Connection con = getConnection(HOST, USER, PASS);
             PreparedStatement insert = con.prepareStatement(INSERT_SQL)){;
            insert.setString(1, "Orange");
            insert.setInt(2, 5);
            insert.executeUpdate();
        } catch (SQLException e) {
            throw new MainaSqlException(e);

        }

    }
}
