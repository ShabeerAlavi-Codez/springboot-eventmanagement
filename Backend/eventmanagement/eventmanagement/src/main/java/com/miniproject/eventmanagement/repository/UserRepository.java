package com.miniproject.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miniproject.eventmanagement.model.User;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

    User findByname(String name);
    User findById(Long id);
    
}


