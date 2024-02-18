package com.springboot.blog.Payload;

import lombok.Data;
import org.springframework.http.HttpStatusCode;

@Data
public class PostDto {
    private long id;
    private String title;
    private String description;
    private String content;
}
