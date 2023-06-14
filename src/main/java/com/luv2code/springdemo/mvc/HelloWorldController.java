package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    private static final String VIEW_PREFIX = "helloworld";

    @RequestMapping("/showForm")
    public String showForm() {
        return VIEW_PREFIX + "-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return VIEW_PREFIX;
    }

    @RequestMapping("/processFormVersionTwo")
    public String letShoutDude(HttpServletRequest request, Model model) {
        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "Yo !" + theName;
        model.addAttribute("message", result);
        return VIEW_PREFIX;
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
        theName = theName.toUpperCase();
        String result = "Yo Hi this is request param annotation!" + theName;
        model.addAttribute("message", result);
        return VIEW_PREFIX;
    }
}
