package com.example.demo.task_serivces;
import com.example.demo.Repositoris.user_Repository;
import com.example.demo.task.User;
import com.example.demo.task.task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class user_serivces {
    user_Repository user_Repository;
@Autowired
    public user_serivces(user_Repository user_Repository) {
        this.user_Repository = user_Repository;
    }
    public User createUser (User user ){
        return user_Repository.save(user);
    }
}
