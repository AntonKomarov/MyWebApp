package com.mysoft;

public class Post {
    int id;

    public Post(int id, String txt) {
        this.id = id;
        this.txt = txt;
    }

    String txt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", txt='" + txt + '\'' +
                '}';
    }
}
