package ua.com.alxs.dev.ykh_springone.controllers;

import org.springframework.web.bind.annotation.*;
import ua.com.alxs.dev.ykh_springone.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
public class MainController {

    List<User> users = new ArrayList<>();

    public MainController() {

        users.add(new User(1,"Yaro"));
        users.add(new User(2,"Laba"));
        users.add(new User(3,"Sofi"));
        users.add(new User(4,"Anna"));
        users.add(new User(5,"Alin"));
    }

    @GetMapping("/")
    public String homePage(){
        return "Hello first server";
    }
    @GetMapping("/users")
    public List<User> getUsers(){


          return users;
    }

    @GetMapping("/users/{id}")
     public User getUser(@PathVariable int id){
        User user1 = users.stream().filter(user -> user.getId() == id).collect(Collectors.toList()).get(0);
        return user1;
    }
    @PostMapping("/users")
    public List<User> saveUser(@RequestBody User user){
        System.out.println("work");

        users.add(user);
        return users;

    }
}
