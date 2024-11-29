package com.vedruna.server.services;



import com.vedruna.server.persistance.model.Technology;

public interface TechnologyServiceI {

    void saveTechnology(Technology technology);
    boolean deleteTechnology(Integer id);
    Technology findById(Integer techId);
    void associateTechnologyWithProject(int projectId, int technologyId);



    
} 