package com.dailycodebuffer.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String getUser() {
        return "Hello Everyone";
    }

    @GetMapping("/users")
    public User getUsers() {
         User user = new User(1,"Krishna");
         return user;
    }
}
