package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/cat")
public class CatController {
    private ArrayList<Cat> list = new ArrayList<>();
    @GetMapping
    public ArrayList<Cat> getCats(){
        return list;
    }
    @PostMapping
    public  void createCat(@RequestBody Cat cat){
//        {
//            "name": "tom",
//                "age": 10
//        }
        list.add(cat);

    }


}
