package com.mac.sql.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
    public  Connection getConnection() throws Exception {
        /*String url = "jdbc:mysql://localhost:3306/cricketi";
        String uname = "root";
        String pass = "";*/

        String url = "jdbc:postgresql://localhost:5432/Cricket";
        String uname = "postgres";
        String pass = "macp";

        //Class.forName("com.mysql.cj.jdbc.Driver");
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        return con;
    }
}
