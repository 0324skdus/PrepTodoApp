package com.codestates.prepTodoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/")
    public String HelloString(){
        return "To-do Application !";
    }
}
