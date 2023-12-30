package com.example.demo.Repositoris;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.task.task;

import java.util.List;
import java.util.Optional;
@Repository
public interface Task_Repository extends JpaRepository<task,Integer > {
    @Override
@CacheEvict ("taskcache")

    <S extends task> S save( S task);
    @Override
    @CacheEvict ("taskcache")

    void delete( task task);
    @Override
    @Cacheable("taskcache")
   Optional<task> findById(Integer identifier);
    @Override
    @Cacheable("taskcache")
    List<task> findAll();
}
