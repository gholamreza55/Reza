package employ;

import java.sql.SQLException;

public class MainSqlException extends RuntimeException {
    public MainSqlException(SQLException e) {
        super(e);
    }
}
