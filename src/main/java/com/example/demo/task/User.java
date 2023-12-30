package com.example.demo.task;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String email;
    @OneToMany(mappedBy = "user")


    List<task> tasks;
    public User() {
    }

    public User(int id, String user) {
        this.id = id;
        this.email = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String user) {
        this.email = user;
    }
}
