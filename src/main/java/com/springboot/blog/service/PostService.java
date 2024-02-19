package com.springboot.blog.service;

import com.springboot.blog.Payload.PostDto;
import com.springboot.blog.Payload.PostResponse;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    String deletePostById(long id);

}
