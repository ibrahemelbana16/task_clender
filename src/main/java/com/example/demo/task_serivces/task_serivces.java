package com.example.demo.task_serivces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.example.demo.task.task;
import com.example.demo.Repositoris.Task_Repository;

import java.util.List;
import java.util.Optional;

@Service
public class task_serivces {
    Task_Repository task_Repository;
    @Autowired

    public task_serivces(Task_Repository task_Repository) {
        this.task_Repository = task_Repository;
    }

    public task createTask (task task ){
        return task_Repository.save(task);
    }
    public void deleteTask (int id){
         task_Repository.deleteById(id);
    }
    public task getById (int id) throws Exception {
        Optional<task> task = task_Repository.findById( id);
        if( task.isPresent()){
            return task.get();
        }
        throw new Exception ("id not found");
    }
    public List<task> getAllTasks (){
        return task_Repository.findAll();
    }

}
