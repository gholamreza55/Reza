package employ;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class EmployeeListServiceDAOImpl implements EmployeeListServiceDAO{
    private static final String HOST = "jdbc:mysql://localhost:3306/employee";
    private static final String USER = "root";
    private static final String PASS = "Gh1372165509";
    private static final String INSERT_SQL = "INSERT INTO ITEM(name, quantity) VALUES(?, ?)";
    private static final String SELECT_SQL = "SELECT * FROM ITEM ORDER BY id DESC limit 1";
   // private static final String DELETE_SQL = "DELETE FROM ITEM ORDER BY id DESC limit 1";

    @Override
    public List<Fruit> findAllFruit() {
        List<Fruit> fruits = new LinkedList<>();

        try(Connection coni = DriverManager.getConnection(HOST, USER, PASS);
            PreparedStatement select = coni.prepareStatement(SELECT_SQL)){
            ResultSet resultSet = select.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                int quantity = resultSet.getInt("quantity");
                fruits.add(new Fruit(name, quantity));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fruits;
    }

    @Override
    public void saveFruit(List<Fruit> fruits) {
        try(Connection coni = DriverManager.getConnection(HOST, USER, PASS);
            PreparedStatement insert = coni.prepareStatement(INSERT_SQL)){
            insert.setString(1, "Orange");
            insert.setInt(2, 5);
            insert.executeUpdate();
        } catch (SQLException e) {
            throw new MainSqlException(e);

        }
    }
}
