package com.mongo_project.entity;

import java.util.List;

public class CommentResponse {
    String statusCode;
    String message;
    List<Comment> comments;

    public CommentResponse() {
    }

    public CommentResponse(String statusCode, String message, List<Comment> comments) {
        this.statusCode = statusCode;
        this.message = message;
        this.comments = comments;
    }

    public String getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public List<Comment> getComments() {
        return comments;
    }
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }


}
