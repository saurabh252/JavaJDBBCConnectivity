package databse;
import java.sql.*;
/*1. import package--> java.sql
 * 2. load and register the driver--> com.mysql.jdbc.Driver
 * 3. create connection
 * 4. create statement
 * 5. execute query
 * 6. process the result
 * 7. close the connection
 * */


public class DataBaseConnection  {

    private static String url = "jdbc:mysql://localhost:3306/learning";
    private static String user = "root";
    private static String password = "password";


    public static Connection connectDataBase(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

}
