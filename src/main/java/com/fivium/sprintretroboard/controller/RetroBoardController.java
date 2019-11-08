package com.fivium.sprintretroboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RetroBoardController {

    @GetMapping("/")
    public ModelAndView showView(ModelAndView modelAndView) {
        modelAndView.addObject("testAttribute", "hello rob");
        modelAndView.setViewName("retro-board");
        return modelAndView;
    }
}
