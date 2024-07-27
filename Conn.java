import java.sql.*;
import org.mariadb.jdbc.*;
    /*
     * the functionality of this program it is to connect java programs/applications
     * to a database
     */
 public class Conn{
    public static void main (String [] args){
        //this variables store the login credentials to access to the mariadb database
    String url = "jdbc:mariadb://localhost:3306/conn_java";
    String username = "root";
    String password = "S010496e";

    Connection conn = DriverManager.getConnection(url, username, password);
    //create a statment
    statment stmt = conn.createStatement();
    //execute a query
    //replace mytable with table name
    ResultSet rs = stmt.executeQuery("SELECT*FROM credentials");
    //prcess the results of the query
    while(rs.next()){
        String column1 = rs.getString("column1");
        int column2 = rs.getInt("column2");
    } catch (SQLException e){
        e.printStackTrace("ERROR connecting to MAriaDB database: ");
    }
    //Close the connection to the database
    conn.close();
    }
 }
