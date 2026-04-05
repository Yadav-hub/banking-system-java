import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/banking_system";
    private static final String USERNAME = "root";

    private static final String PASSWORD = "root1234";

    public static Connection getConnection() throws Exception
    {
        Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        System.out.println("Connected to Database Successfully");
        return con;

    }
    
}
