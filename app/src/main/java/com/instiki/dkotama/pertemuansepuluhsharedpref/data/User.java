package com.instiki.dkotama.pertemuansepuluhsharedpref.data;

public class User {
    private String username;
    private String password;
    private String name = "Kosong";


    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
