package org.sidorov.spring_boot_rest_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/")
public class HomeController {

    @GetMapping
    public ModelAndView getIndex(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
