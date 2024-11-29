package com.vedruna.server.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedruna.server.persistance.model.Technology;

public interface TechnologyRepositoryI extends JpaRepository<Technology, Integer> {
    
    
} 
