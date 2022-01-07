package com.codegym.cms.controller;

import com.codegym.cms.model.Blog;
import com.codegym.cms.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Transactional
public class BlogController {
    @Autowired
    IBlogService blogService;

    @GetMapping("")
    public String home(Model model){
        model.addAttribute("blogs", blogService.findAll());
        return "/home";
    }

    @GetMapping("/create")
    public String getCreate(Model model){
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping("/create")
    public ModelAndView postCreate(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/create");
//        modelAndView.addAllObjects("blog", blog);
        return modelAndView;
    }

    @GetMapping("/{id}/edit")
    public ModelAndView getEdit(@PathVariable Long id){
        ModelAndView modelAndView =new ModelAndView("/edit");
        modelAndView.addObject("blog",blogService.findById(id));
        return modelAndView;
    }

    @PostMapping("/update")
    public String udate(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("msg", "Update Blog with Id:" +
                blog.getId() + "success");
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public ModelAndView getDelete(@PathVariable Long id){
        ModelAndView modelAndView =new ModelAndView("/delete");
        modelAndView.addObject("blog",blogService.findById(id));
        return modelAndView;
    }

    @PostMapping("/delete")
    public String postDetele(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes){
        blogService.remove(blog.getId());
        redirectAttributes.addFlashAttribute("msg", "Update Blog with Id:" +
                blog.getId() + "success");
        return "redirect:/";
    }

    @GetMapping("/{id}/view")
    public ModelAndView view(@PathVariable Long id){
        ModelAndView modelAndView =new ModelAndView("/view");
        modelAndView.addObject("blog",blogService.findById(id));
        return modelAndView;
    }
}
