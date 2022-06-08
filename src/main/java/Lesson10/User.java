package Lesson10;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String password;
    private String[] posts = new String[10];

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getPosts() {
        return posts;
    }

    public void setPosts(String[] posts) {
        for(int i=0;i<posts.length;i++){
         this.posts[i]=posts[i].trim();
        }
    }
}
