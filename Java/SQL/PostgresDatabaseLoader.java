package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class PostgresDatabaseLoader extends DatabaseLoader {

    public PostgresDatabaseLoader(String server, String login, String password) {
        super(server, login, password);
    }

    @Override
    public Connection open() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://" + server, login, password);
        return connection;
    }

    @Override
    public void close() {

    }
}
