package com.springboot.blog.service;

import com.springboot.blog.Payload.PostDto;
import org.springframework.http.HttpStatusCode;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
