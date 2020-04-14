package com.mysoft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DAO {
    static List<Post> posts;
    static{
        posts = new ArrayList<>();
        posts.add(new Post(1, "Hello"));
        posts.add(new Post(2, "world"));
        posts.add(new Post(3, "Anton"));
    }

    public static List<Post> getPosts(){
        return posts;
    }

    public static void deletePost(int index){
        posts.removeIf(p -> p.id == index);
    }
}
