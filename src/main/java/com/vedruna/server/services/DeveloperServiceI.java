package com.vedruna.server.services;



import com.vedruna.server.persistance.model.Developer;

public interface DeveloperServiceI {

    void saveDeveloper(Developer developer);
    boolean deleteDeveloper(Integer id);
    Developer findById(Integer developerId);



    
} 