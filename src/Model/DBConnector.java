/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author huutr
 */
public class DBConnector {
    public static Connection getConnect() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String sql = "jdbc:sqlserver://localhost:1433;databaseName=QLBHnew;user=sa;password=sa;";
        Connection conn = DriverManager.getConnection(sql);
        return conn;
    }
}

