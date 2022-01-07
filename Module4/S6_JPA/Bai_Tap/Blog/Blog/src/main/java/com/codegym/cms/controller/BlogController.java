package com.codegym.cms.controller;

import com.codegym.cms.model.Blog;
import com.codegym.cms.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {
    @Autowired
    IBlogService blogService;

    @GetMapping("")
    public String home(){
        return "home";
    }

    @GetMapping("/create")
    public String getCreate(Model model){
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String postCreate(Blog blog){
        blogService.save(blog);
        return "create";
    }
}
