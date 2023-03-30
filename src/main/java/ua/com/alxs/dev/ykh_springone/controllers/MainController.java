package ua.com.alxs.dev.ykh_springone.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.com.alxs.dev.ykh_springone.dao.UserDAO;
import ua.com.alxs.dev.ykh_springone.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@AllArgsConstructor
public class MainController {
    private UserDAO userDAO;
@PostMapping("/users")
    public void save(@RequestBody User user){
   userDAO.save(user);

}
@GetMapping("/users")
    public List<User> getUsers(){
    List<User> all=userDAO.findAll();
    return all;
}
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        User user = userDAO.findById(id).get();
        return user;
    }
}
