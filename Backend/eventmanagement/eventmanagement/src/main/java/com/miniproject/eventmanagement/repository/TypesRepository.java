package com.miniproject.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miniproject.eventmanagement.model.Types;

@Repository
public interface TypesRepository extends JpaRepository<Types,Integer>{
    
}

