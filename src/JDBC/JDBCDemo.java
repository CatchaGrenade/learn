package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/gamedb", "root", "Csq19961012");

        String sql = "select * from t_test";

        Statement statement = con.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            System.out.println(resultSet.getString("UID"));
        }
        statement.close();
        con.close();
    }
}
