package com.example.demo.Repositoris;
import com.example.demo.task.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface user_Repository extends JpaRepository<User,Integer > {

}
