package com.hanah.book.springboot.web;

import com.hanah.book.springboot.service.posts.PostsService;
import com.hanah.book.springboot.web.dto.PostsResponseDto;
import com.hanah.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

}
