package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String postsIndex(){


        return "Index for posts page;";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postView(@PathVariable long id){


        return "Future page to show off id: " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postsCreate(){


        return "Form for creating a post!";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String submitPost(){

        return "create a new post";
    }
}
