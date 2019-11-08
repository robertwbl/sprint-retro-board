package com.fivium.sprintretroboard.controller;

import com.fivium.sprintretroboard.enumeration.PostitColour;
import com.fivium.sprintretroboard.model.Action;
import com.fivium.sprintretroboard.model.Person;
import com.fivium.sprintretroboard.model.Postit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RetroBoardRestController {

   @GetMapping("/rest/postit")
   public List<Postit> getPostitList(){

        List<Postit> postits = new ArrayList<>();
        postits.add(new Postit(PostitColour.GREEN, new Person("Dan", "Roy"), "SBA Happening!", false));
        postits.add(new Postit(PostitColour.GREEN, new Person("Robert", "Loveless"), "Yey.", true));
        postits.add(new Postit(PostitColour.RED, new Person("CCM", "Bot"), "Maurizio says hi.", false));

       return postits;

   }

    @GetMapping("/rest/action")
    public List<Action> getActionList(){

        List<Action> actions = new ArrayList<>();
        actions.add(new Action("Here is my first action.", new Person("Jay", "Gildea"), false));
        actions.add(new Action("Here is my second action.", new Person("Matt", "Warner"), true));

        return actions;

    }
}
