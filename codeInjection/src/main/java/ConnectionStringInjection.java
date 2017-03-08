import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionStringInjection {

    private static String dbms = "12:121:121:12";

     public static void main(String dbName) throws SQLException {
		DriverManager.getConnection("jdbc:" + dbms + ":" + dbName + ";create=true");
     }
}