package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody

    public String skills() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>My Favorite Programming Languages</h2>" +
                "<ol>" +
                "<list>TypeScript</list>"+
                "<br>"+
                "<list>Java</list>"+
                "<br>"+
                "<list>JavaScript</list>"+
                "</ol>" +
                "</body>" +
                "<html>";
    }

    @GetMapping("form")
    @ResponseBody

    public String skills(PathVariable String faveOne, PathVariable String faveTwo, PathVariable String faveThree) {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>My Favorite Programming Languages</h2>" +
                "<ol>" +
                "<list>" + faveOne +"</list>"+
                "<br>"+
                "<list>" + faveTwo +"</list>"+
                "<br>"+
                "<list>" + faveThree +"</list>"+
                "</ol>" +
                "</body>" +
                "<html>";
    }
}
