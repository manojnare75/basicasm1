package com.manojnare.basicasm.controller;

import com.manojnare.basicasm.entity.users;
import com.manojnare.basicasm.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path="users")
public class userController {
    @Autowired
    private userRepository userRepository;

    @GetMapping("/get")
    public List<users> getUser(){return (List<users>) userRepository.findAll();}

    @PostMapping("/add")
    public void createUser(@RequestBody users users){userRepository.save(users);}

    @DeleteMapping(path= {"/{id}"})
    public Optional<users> deleteUser(@PathVariable("id") long id) {
        Optional<users> users =userRepository.findById(id);
        userRepository.deleteById(id);
        return users;
    }
}
