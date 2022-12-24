package id.hadeuh.tugaspendahuluan12.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hilmantm
 */
public class SQLConfig {
    
    private static Connection connection;

    public static Connection getConnection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_tp_12","root","");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
    
}
