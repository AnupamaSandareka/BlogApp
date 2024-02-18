package com.springboot.blog.controller;

import com.springboot.blog.Payload.PostDto;
import com.springboot.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping(path = "/createPost")
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        return  new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
    }

    @GetMapping(path = "/getAllPosts")
    List<PostDto> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping(path = "/getPostById/{id}")
    PostDto getPostById(@PathVariable(name = "id") long id){
        return postService.getPostById(id);
    }
}
