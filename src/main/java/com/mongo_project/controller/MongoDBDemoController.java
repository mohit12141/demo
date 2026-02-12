package com.mongo_project.controller;

import org.springframework.web.bind.annotation.RestController;

import com.mongo_project.entity.Comment;
import com.mongo_project.entity.CommentResponse;
import com.mongo_project.service.CommentService;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MongoDBDemoController {

    private CommentService commentService;

    MongoDBDemoController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello, MongoDB!");
    }

    @GetMapping("/comment")
    public ResponseEntity<List<Comment>> getAllComment(@RequestParam int page, @RequestParam int size){
        Page<Comment> comments = commentService.getComment(page, size);
        if(comments.isEmpty()){
            return ResponseEntity.noContent().build();
        } 
        return ResponseEntity.ok(comments.getContent());
    }
    
    @GetMapping("/email")
    public ResponseEntity<CommentResponse> getCommentStartingWithEmail(@RequestParam String email){
        CommentResponse commentResponse = commentService.getCommentStartingWithEmail(email);
        return ResponseEntity.ok(commentResponse);
    }

    @GetMapping("/email/count")
    public ResponseEntity<CommentResponse> getCountByEmail(@RequestParam String email){ 
        CommentResponse response = commentService.getCountByEmail(email);
        return ResponseEntity.ok(response);
    }
    
    
}
