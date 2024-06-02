package com.hollywood.hollywood_data_spring_boot.service;

import com.hollywood.hollywood_data_spring_boot.dao.FilmDao;
import com.hollywood.hollywood_data_spring_boot.dto.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class FilmService {

    private final FilmDao filmDao;

    @Autowired
    public FilmService(FilmDao filmDao){
        this.filmDao = filmDao;
    }

    public List<Film> getFilms(){
        return filmDao.getFilms();
    }

    public Film getLongest() {
        return filmDao.getFilms().stream().reduce((f1,f2)-> f1.getLength()>f2.getLength()? f1:f2).orElseThrow(()->new RuntimeException(
                "no files found"));
    }
    public Film getShortest() {
        return filmDao.getFilms().stream().reduce((f1,f2)-> f1.getLength()<f2.getLength()? f1:f2).orElseThrow(()->new RuntimeException(
                "no files found"));
    }
}
