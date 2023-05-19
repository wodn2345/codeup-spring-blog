package com.codeup.codeupspringblog;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
@ModelAttribute
@Controller
public class DiceController {
    @GetMapping("/roll-dice/{number}")
    public String diceStart(@PathVariable int number, Model model){

        return "rollDiveView";
    }

    @GetMapping("/roll-dice/{number}")
    public String diceRolled(@PathVariable int number, Model model){

        model.addAttribute("number", number);
        return "rollDiveView";
    }
}
