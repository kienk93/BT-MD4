package com.example.blogger.controller.blog;

import com.example.blogger.model.Student;
import com.example.blogger.service.blog.IStudentService;
import com.example.blogger.service.comment.IGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    IStudentService blogService;
    @Autowired
    IGradeService commentService;
    @GetMapping("/list")
    public ModelAndView showListBlog(){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("blogs",blogService.findAll());
        return modelAndView;
    }
    @GetMapping()
    public ResponseEntity<?> showBlog() {
        return new ResponseEntity<>(blogService.findAll(),HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<?> createBlog(@RequestBody Student student) {
        return new ResponseEntity<>(blogService.save(student),HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<?> editBlog(@RequestBody Student student) {
        return new ResponseEntity<>(blogService.save(student),HttpStatus.OK);

    }
    @DeleteMapping
    public ResponseEntity<?> deleteBlog(@RequestParam Long id) {
        blogService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }










//    @GetMapping
//    public ModelAndView showList(){
//        ModelAndView modelAndView = new ModelAndView("list");
//        modelAndView.addObject("blogs__list",blogService.findAll());
//        modelAndView.addObject("comment__list",commentService.findAll());
//        return modelAndView;
//    }
//    @GetMapping("/create")
//    public ModelAndView showCreateForm(){
//        ModelAndView modelAndView = new ModelAndView("create");
//        modelAndView.addObject("blogs__create",new Blog());
//        modelAndView.addObject("comment__list",commentService.findAll());
//        return modelAndView;
//    }
//    @PostMapping("/create")
//    public ModelAndView createBlog(Blog blog){
//        ModelAndView modelAndView = new ModelAndView("redirect:/blogs");
//        modelAndView.addObject("blogs", blog);
//        blogService.save(blog);
//        return modelAndView;
//    }
//    @GetMapping("/edit/{id}")
//    public  ModelAndView showEditForm(@PathVariable Long id){
//        ModelAndView modelAndView = new ModelAndView("edit");
//        Optional<Blog> blogOptional = blogService.findById(id);
//        modelAndView.addObject("comment__list",commentService.findAll());
//        modelAndView.addObject("blogs__id",blogOptional.get());
//        return modelAndView;
//    }
//    @PostMapping("/edit")
//    public ModelAndView saveEdit(@RequestParam Long id,Blog blog){
//        blogService.findById(id);
//        blogService.save(blog);
//        ModelAndView modelAndView = new ModelAndView("redirect:/blogs");
//
//        return modelAndView;
//    }
//    @GetMapping("/delete/{id}")
//    public ModelAndView deleteBlog(@PathVariable long id){
//        blogService.findById(id);
//        blogService.delete(id);
//        return new ModelAndView("redirect:/blogs");
//
//    }
//    @GetMapping("/view/{id}")
//    public ModelAndView showView(@PathVariable Long id){
//        ModelAndView modelAndView = new ModelAndView("view");
//        modelAndView.addObject("blogs",blogService.findById(id));
//        return modelAndView;
//
//    }
//    @PostMapping("/view")
//    public ModelAndView backList(){
//        ModelAndView modelAndView = new ModelAndView("redirect:/blogs");
//        return modelAndView;
//    }
}