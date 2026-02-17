package com.mongo_project.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.*;
import org.springframework.stereotype.Repository;

import com.mongo_project.entity.Comment;
@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
    List<Comment> findAllBy(Pageable pageable);

    @Query("{'email': { $regex: '^?0', $options: 'i' }}")
    List<Comment> findByEmail(String email);

    @Query(value = "{'email': { $regex: '^?0', $options: 'i' }}", count = true)
    long getCountByEmail(String email);

    @Query(value = "{'date' : {$gte : ?0, $lte : ?1}}")
    List<Comment> findByDateRange(LocalDateTime start, LocalDateTime end);
}
