package com.mac.sql.common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CricketInfoRepository {

    ConnectionManager connectionManager = new ConnectionManager();

    public List<Player> displayData() throws Exception {

        Connection con = connectionManager.getConnection();
        String query = "Select * From \"India\"";

        List<Player> playerList = print(con, query);

        con.close();
        return playerList;
    }

    public void insertIntoTable(String name, String responsibility) throws Exception {

        Connection con = connectionManager.getConnection();

        String query = "Insert into india (Name, Responsibility) values ('" + name + "', '" + responsibility + "')";

        Statement st = con.createStatement();
        int count = st.executeUpdate(query);

        System.out.println(count + "rows affected ");
        st.close();
        con.close();
    }

    public void deleteFromTable(int id) throws Exception {


        String query = "Delete from india where id = " + id + "";

        Connection con = connectionManager.getConnection();

        Statement st = con.createStatement();
        int count = st.executeUpdate(query);

        System.out.println(count + "rows affected ");
        st.close();
        con.close();
    }

    public void updateTable(int id, String name, String responsibility) throws Exception {

        String query = "update india set Name = '" + name + "', Responsibility = '" + responsibility + "' where Id = '" + id + "'";

        Connection con = connectionManager.getConnection();

        Statement st = con.createStatement();
        int count = st.executeUpdate(query);

        System.out.println(count + "rows affected ");
        st.close();
        con.close();
    }

    public List<Player> search(String player) throws Exception {

        String query = "Select * from 'India' where name  = '" + player + "'";

        Connection con = connectionManager.getConnection();


        List<Player> playerlist = print(con, query);

        con.close();
        return playerlist;
    }

    public List<Player> print(Connection conParam, String queryParam) throws SQLException {

        int id = 0;
        String name = "";
        String responsibility = "";
        List<Player> plist= new ArrayList<Player>();

        Statement st = conParam.createStatement();
        ResultSet rs = st.executeQuery(queryParam);
        while (rs.next()) {
          id =  rs.getInt("Id");
          name =  rs.getString("Name");
          responsibility =   rs.getString("Responsibility");

            Player player = new Player(id,name, responsibility);
            plist.add(player);
        }

        st.close();
        return plist;
    }
}
