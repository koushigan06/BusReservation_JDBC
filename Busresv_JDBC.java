package JDBC;

import java.sql.*;

public class Busresv_JDBC {
    private static final String url="jdbc:mysql://localhost:3306/busresv";
    private static final String userName="root";
    private static final String password="Chinni@6+7";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, userName, password);
    }
}
