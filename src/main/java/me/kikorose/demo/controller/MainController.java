package me.kikorose.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index(){
        return "Welcome Page";
    }

    public String logIn(){
        return "This is the Login Page";
    }

    public String addProducts(){


        return "Add a Product Here";
    }

    public String listProducts(){

        return "This is a List of your Products";
    }


}
