package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping()
    public ModelAndView getNumberSum(@RequestParam(required = false) String num1, String num2, String calculator) {
        ModelAndView modelAndView = new ModelAndView("index");
        if (calculator == null) {
            calculator = "";
        }
        int kq = 0;
        if (calculator.equals("+")) {
            kq = Integer.parseInt(num1) + Integer.parseInt(num2);
        }
        if (calculator.equals("-")) {
            kq = Integer.parseInt(num1) - Integer.parseInt(num2);
        }
        if (calculator.equals("*")) {
            kq = Integer.parseInt(num1) * Integer.parseInt(num2);
        }
        if (calculator.equals("/")) {
            kq = Integer.parseInt(num1) / Integer.parseInt(num2);
        }

        modelAndView.addObject("num1", num1);
        modelAndView.addObject("num2", num2);
        modelAndView.addObject("kq", kq);
        modelAndView.addObject("calculator", calculator);
        return modelAndView;
    }
}

