package com.hollywood.hollywood_data_spring_boot.controller;

import com.hollywood.hollywood_data_spring_boot.dto.Actor;
import com.hollywood.hollywood_data_spring_boot.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class ActorController {

    private final ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService){
        this.actorService = actorService;
    }

    @GetMapping("actors")
    public List<Actor> getActors(){
        return actorService.getActors();
    }

    @GetMapping("actorslnwith")
    public List<Actor> getActors(@RequestParam(defaultValue = "A",required = false) String c){
        return actorService.getActorsFirstName(c.toUpperCase());
    }

    @GetMapping("actorsfnwith/{c}")
    public List<Actor> getActorsPathVar(@PathVariable String c){
        return actorService.getActorsLastName(c.toUpperCase());
    }

    @GetMapping("hash")
    public List<HashMap<String,String>> get(){
        List<HashMap<String,String>> lh = new ArrayList<>();
        HashMap<String,String> h = new HashMap<>();
        h.put("name","virat");
        h.put("age","33");
        lh.add(h);
        return lh;
    }

}
