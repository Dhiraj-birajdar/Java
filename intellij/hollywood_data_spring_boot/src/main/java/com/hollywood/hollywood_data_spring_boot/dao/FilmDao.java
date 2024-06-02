package com.hollywood.hollywood_data_spring_boot.dao;

import com.hollywood.hollywood_data_spring_boot.dto.Film;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Film> getFilms(){
        return entityManager.createQuery("select f from Film  f",Film.class).getResultList();
    }
}
