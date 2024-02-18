package com.springboot.blog.service;

import com.springboot.blog.Payload.PostDto;
import org.springframework.http.HttpStatusCode;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts();
}
