package com.springboot.blog.Payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Map;

@Data
public class CommentDto {

    private long id;

    @NotEmpty(message = "Name should not be empty.")
    private String name;

    @NotEmpty(message = "Email should not be empty.")
    private String email;

    @NotEmpty
    private String body;
}
