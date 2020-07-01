package com.durgaprasad.androidplayground;

public class Contacts {
    String name;
    String Email;
    String Url;

    public Contacts(String name, String email, String url) {
        this.name = name;
        this.Email = email;
        this.Url = url;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
