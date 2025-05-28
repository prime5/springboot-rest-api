package com.example.taskapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private boolean completed;

    // Getters and setters
    public Long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public boolean isCompleted(){
        return completed;
    }
    //Setters
    public void setId(Long id) {
        this.id=id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setDescription(String description){this.description=description;}
    public void setCompleted(){
        this.completed=completed;
    }
}

