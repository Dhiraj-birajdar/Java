package com.jobpostmongodb.controller;

import com.jobpostmongodb.model.Post;
import com.jobpostmongodb.repository.PostRepository;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@Tag(name = "Post")
public class PostController {

    private final PostRepository repository;

    public PostController(PostRepository repository) {
        this.repository = repository;
    }

    @Hidden
    @RequestMapping("")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui/index.html");
    }

    @GetMapping("all")
    public List<Post> getAllPosts() {
        return repository.findAll();
    }

     @GetMapping("all/{page}/{size}")
    public List<Post> getAllPosts(@PathVariable int size, @PathVariable int page) {
         Pageable pageable = PageRequest.of(page,size, Sort.by("exp").descending());
        return repository.findAll(pageable).toList();
    }

    @PostMapping("post")
    public Post savePost(@RequestBody Post post) {
        return repository.save(post);
    }



    @GetMapping("/home")
    public String home() {
        return "Welcome home";
    }
}
