package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller

public class DictionaryController {
    Map<String, String> tudien = new HashMap<>();

    @GetMapping("/haha")
    public ModelAndView getWord(@RequestParam(required = false, name = "abc") String value, Model model) {
        //tạo cặp value trong Hashmap
        tudien.put("hello", "xin chao");
        tudien.put("hero", "sieu nhan");
        tudien.put("cat", "meomeo");
        tudien.put("bye", "tam biet");
        ModelAndView modelAndView = new ModelAndView("index");
        String kq = "";
        // nếu chứa từ thì add vào model
        if (tudien.containsKey(value)) {
            model.addAttribute("kq", tudien.get(value));
        }
        return modelAndView;
    }
}