package com.mysoft;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DAO {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println(getConnection());
        System.out.println(getPosts());
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "postgres");
    }
    public static List<Post> getPosts() throws ClassNotFoundException, SQLException{
        Connection connection = getConnection();
            System.out.println("we are connecting");
            PreparedStatement ps = connection.prepareStatement("select * from posts");
            ResultSet result = ps.executeQuery();
            ArrayList<Post> posts = new ArrayList<>();
            while (result.next()){
                int id = result.getInt(1);
                String txt = result.getString(2);
                posts.add(new Post(id,txt));
            }
            return posts;
    }

    public static void deletePost(int index) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        System.out.println("we are connecting");
        PreparedStatement ps = connection.prepareStatement("delete from posts where id=?");
        ps.setInt(1,index);
        ps.executeUpdate();
    }

    public static void addPost(String txt) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        System.out.println("we are connection");
        PreparedStatement ps = connection.prepareStatement("insert into posts(txt) value (?)");
        ps.setString(1, txt);
        ps.executeUpdate();

    }
}
