package in.sp.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection 
{
    public static Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Connection con = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bag", "root", "Amanraj1234");
        return con;
    }
}