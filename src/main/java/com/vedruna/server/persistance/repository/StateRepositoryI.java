package com.vedruna.server.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedruna.server.persistance.model.State;

public interface StateRepositoryI extends JpaRepository<State, Integer> {
    
    
} 
