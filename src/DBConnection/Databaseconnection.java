package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databaseconnection {
    private static final String url = "jdbc:postgresql://localhost:5432/qap4";
    private static final String user = "admin";
    private static final String password = "password";
    public static Connection getcon()
    {
        Connection connection = null;
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database connection successful");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Database connection failed try again");
            e.printStackTrace();
        }

        return connection;
    }
}



