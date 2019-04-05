package jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String mySqlUser = "root";
    private static final String mySqlPwd = "marsubhai";
    private static final String mySqlCS = "jdbc:mysql://localhost:3306/zipcode_bots?autoReconnect=true&useSSL=false";

    public static Connection getConnection(DBType dbType) throws SQLException {
        Connection conn = null;
        switch (dbType){
            case MYSQLDB:
                conn = DriverManager.getConnection(mySqlCS, mySqlUser, mySqlPwd);
                break;
            default:
                return null;
        }
        System.out.println("Successful connection");
        return conn;
    }

    public static void showErrorMessage(SQLException e){
        System.err.println("Error :" + e.getMessage());
        System.err.println("Error code: " + e.getErrorCode());
    }
}
