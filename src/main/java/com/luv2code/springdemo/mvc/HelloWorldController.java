package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
//we can add a realtive requestmapper so that we can use RequestMapping("/showform) anywhere without ambiguity
@RequestMapping("/hello")
public class HelloWorldController {
    // need a controller method to show the actual form
    @RequestMapping("/showForm") // this will now hello/showForm insetad of /showForm
    public String showForm() {
        return "helloworld-form";
    }

    //need a controller methofd to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }
    //new controller method to read form data
    //add data to model
    @RequestMapping("/processFormVersionTwo")
    public String letShoutDude(HttpServletRequest request , Model model){
        //read the request parameter from the HTML form
        String theName  = request.getParameter("studentName");
        //convert the data to upper case
        theName = theName.toUpperCase();
        //create the message
        String result = "Yo !"  + theName;
        //add the result data to model
        model.addAttribute("message" , result);
        return "helloworld";
    }
    //Read form data using @RequestParam instead of HTTpServdlet


    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){
        //read the request parameter from the HTML form

        //convert the data to upper case
        theName = theName.toUpperCase();
        //create the message
        String result = "Yo Hi this is request param annotation!"  + theName;
        //add the result data to model
        model.addAttribute("message" , result);
        return "helloworld";
    }

}
