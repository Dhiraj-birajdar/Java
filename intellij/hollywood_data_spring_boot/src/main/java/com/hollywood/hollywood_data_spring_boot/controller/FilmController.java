package com.hollywood.hollywood_data_spring_boot.controller;

import com.hollywood.hollywood_data_spring_boot.dto.Film;
import com.hollywood.hollywood_data_spring_boot.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmController {

    private final FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService){
        this.filmService = filmService;
    }

    @GetMapping("films")
    public List<Film> getFilms(){
        return filmService.getFilms();
    }

    @GetMapping("longestfilm")
    public String getLongest(){
        return filmService.getLongest().toString();
    }
    @GetMapping("shortestfilm")
    public String getShortest(){
        return filmService.getShortest().toString();
    }
}
