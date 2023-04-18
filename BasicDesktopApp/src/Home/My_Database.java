

// This class is created to supply database connection to the project

package Home;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SALPARSLAN
 */
public class My_Database {
    
    private static String username = "root";
    private static String password = "";
    
    // You should enter your database name here
    private static String database_name = "users_database";
    
    private static int port_number = 3306;
    private static String server_name = "localhost";
    
    public static Connection getConnection(){
        Connection con = null;
        
        MysqlDataSource data_source = new MysqlDataSource();
        data_source.setServerName(server_name);
        data_source.setUser(username);
        data_source.setPassword(password);
        data_source.setDatabaseName(database_name);
        data_source.setPortNumber(port_number);
        
        try {
            con = data_source.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(My_Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}
