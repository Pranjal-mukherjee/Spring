package com.luv2code.springdemo.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.*;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        theModel.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult
    ) {
        logger.info("LastName: |{}|", theCustomer.getLastName());
        logger.info("Binding result: {}", theBindingResult);
        //spring willl store results of validation in binding result object
        if (theBindingResult.hasErrors()) {
            return "customer-form";
        } else
            return "customer-confirmation";
    }
}
