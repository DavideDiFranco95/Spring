package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Name")
public class NameController{
    @GetMapping("/{name}")
    public String getName(@PathVariable String name){
        return "My name is: " + name;
    }
    @PostMapping("/{name}")
    public String getReverseName(@PathVariable String name){
        StringBuilder newName = new StringBuilder(name);
        StringBuilder reverseName = newName.reverse();
        return "My reversed name is: " + reverseName;
    }
}