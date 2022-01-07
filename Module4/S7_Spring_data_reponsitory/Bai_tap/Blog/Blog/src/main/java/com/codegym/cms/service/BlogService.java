package com.codegym.cms.service;

import com.codegym.cms.model.Blog;
import com.codegym.cms.reponsitory.BlogReponsitory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogService implements IBlogService{
    @Autowired
    BlogReponsitory blogReponsitory;


    @Override
    public List<Blog> findAll() {
        return blogReponsitory.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return blogReponsitory.findById(id);
    }

    @Override
    public void save(Blog blog) {
        blogReponsitory.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogReponsitory.remove(id);
    }
}
