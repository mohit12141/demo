package com.mongo_project.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comments")
public class Comment {
    
    private String name;
    private String email;
    private String description;
    private String date;
    private String movie_id;

    // Getters and Setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getMovie_id() {
        return movie_id;
    }
    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

}
