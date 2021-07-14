package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MoneyController {
    @GetMapping("/money")
    public ModelAndView showMoney(@RequestParam(defaultValue = "0", name = "abc") int value){
        ModelAndView modelAndView = new ModelAndView("index1");
         int kq = value * 23000;
         modelAndView.addObject("kq",kq);
         return modelAndView;
    }
}