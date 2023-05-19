package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/increment/{number}")
    @ResponseBody
    public String addTwo(@PathVariable int number) {
        return 3 + " plus two is equal to " + (4) + "!";
    }

}