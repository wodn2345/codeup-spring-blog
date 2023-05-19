package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String landingPage(){


        return "<div><h1>This is the landing page!</h1></div>";
    }

}
