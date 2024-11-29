package com.vedruna.server.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedruna.server.persistance.model.Developer;

public interface DeveloperRepositoryI extends JpaRepository<Developer, Integer> {
    
    
} 
