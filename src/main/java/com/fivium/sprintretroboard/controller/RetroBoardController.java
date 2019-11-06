package com.fivium.sprintretroboard.controller;

import com.fivium.sprintretroboard.enumeration.PostitColour;
import com.fivium.sprintretroboard.model.Postit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RetroBoardController {

    @GetMapping("/")
    public ModelAndView showView(ModelAndView modelAndView) {
        modelAndView.addObject("testAttribute", "hello rob");
        modelAndView.setViewName("retro-board");

        List<Postit> postits = new ArrayList<Postit>();
        postits.add(new Postit(PostitColour.GREEN, "Dan", "SBA Happening!", false));
        postits.add(new Postit(PostitColour.GREEN, "Robert", "Yey.", false));
        postits.add(new Postit(PostitColour.RED, "Maurizio", "Maurizio says hi.", false));
                modelAndView.addObject("postits", postits);

        return modelAndView;
    }
}
