package com.example.demo.Controller_task;

import com.example.demo.task.User;
import com.example.demo.task.task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.task_serivces.user_serivces;

@RestController
@RequestMapping("/api")
public class contrroller_user {
    user_serivces user_serivces;
@Autowired
    public contrroller_user(user_serivces user_serivces) {
        this.user_serivces = user_serivces;
    }
    @PostMapping("/user")
    public User create_Task(@RequestBody User user){
    return user_serivces.createUser(user);
    }
}
