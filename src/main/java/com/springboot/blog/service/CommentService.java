package com.springboot.blog.service;

import com.springboot.blog.Payload.CommentDto;
import com.springboot.blog.entity.Comment;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(long postId);

    CommentDto getCommentsById(long postId, long commentId);

    CommentDto updateComment(long postId, long commentId, CommentDto commentRequest);

    String deleteComment(long postId, long commentId);
}
