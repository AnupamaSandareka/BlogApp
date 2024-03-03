package com.springboot.blog.controller;

import com.springboot.blog.Payload.CommentDto;
import com.springboot.blog.service.CommentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class CommentController {

    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@PathVariable(value = "postId") long postId,
                                                   @Valid @RequestBody CommentDto commentDto){

        return new ResponseEntity<>(commentService.createComment(postId,commentDto), HttpStatus.CREATED);

    }

    @GetMapping(path = "/posts/{postId}/comments")
    List<CommentDto> getCommentsByPostId(@PathVariable(value = "postId") long postId){
       return commentService.getCommentsByPostId(postId);
    }

    @GetMapping(path = "/posts/{postId}/comments/{commentId}")
    CommentDto getCommentsById(@PathVariable(value = "postId") long postId,
                               @PathVariable(value = "commentId") long commentId){

        return commentService.getCommentsById(postId, commentId);
    }

    @PutMapping(path = "/posts/{postId}/comments/{commentId}")
    CommentDto updateComment(@PathVariable(value = "postId") long postId,
                             @PathVariable(value = "commentId") long commentId,
                             @Valid @RequestBody CommentDto commentRequest){
        return commentService.updateComment(postId, commentId, commentRequest);
    }

    @DeleteMapping(path = "/posts/{postId}/comments/{commentId}")
    String deleteComment(@PathVariable(value = "postId") long postId,
                         @PathVariable(value = "commentId") long commentId){
        return commentService.deleteComment(postId, commentId);
    }
}
