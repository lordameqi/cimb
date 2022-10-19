package com.cimb.training.springsecurityoauth2jwt.controller;

import com.cimb.training.springsecurityoauth2jwt.entity.Blog;
import com.cimb.training.springsecurityoauth2jwt.repository.BlogRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class BlogController {
    final private BlogRepository blogRepository;

    public BlogController(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @GetMapping("/blog")
    public List<Blog> index(){
        return blogRepository.findAll();
    }

    @GetMapping("/blog/{id}")
    public Blog show(@PathVariable String id){
        int blogId = Integer.parseInt(id);
        return blogRepository.findById(blogId).orElse(new Blog());
    }

    @PostMapping("/blog/search")
    public List<Blog> search(@RequestBody Map<String,String> body){
        String search = body.get("text");
        return blogRepository.findByTitleContainingOrContentContaining(search,search);
    }

    @PostMapping("/blog")
    public Blog create(@RequestBody Map<String,String> body){
        String title = body.get("title");
        String content = body.get("content");
        String author = body.get("author");

        return blogRepository.save(new Blog(title,content, author));
    }

    @PutMapping("/blog/{id}")
    public Blog update(@PathVariable String id,@RequestBody Map<String,String> body){
        int blogId = Integer.parseInt(id);

        //getting blog
        Blog blog = blogRepository.findById(blogId).orElse(new Blog());
        blog.setContent(body.get("content"));
        blog.setTitle(body.get("tittle"));
        return blogRepository.save(blog);
    }

    @DeleteMapping("/blog/{id}")
    public boolean delete(@PathVariable String id){
        int blogId = Integer.parseInt(id);
        blogRepository.deleteById(blogId);
        return true;
    }
}
