package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public String addNums(@PathVariable int num1, @PathVariable int num2) {
        return "You want to add " + num1 + " and " + num2 + " Here is the sum: " + (num1 + num2);
    }

    @GetMapping("/subtract/{num1}/and/{num2}")
    @ResponseBody
    public String subtractNums(@PathVariable int num1, @PathVariable int num2) {
        return "You want to subtract " + num1 + " and " + num2 + " Here is the sum: " + (num1 - num2);
    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public String multiplyNums(@PathVariable int num1, @PathVariable int num2) {
        return "You want to multiply " + num1 + " and " + num2 + " Here is the sum: " + (num1 * num2);
    }

    @GetMapping("/divide/{num1}/and/{num2}")
    @ResponseBody
    public String divideNums(@PathVariable int num1, @PathVariable int num2) {
        return "You want to divide " + num1 + " nd " + num2 + " Here is the sum: " + (num1 / num2);
    }

}