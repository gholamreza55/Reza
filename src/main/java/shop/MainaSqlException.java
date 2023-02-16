package shop;

import java.sql.SQLException;

public class MainaSqlException extends RuntimeException {
    public MainaSqlException(SQLException e) {
        super(e);
    }
}
