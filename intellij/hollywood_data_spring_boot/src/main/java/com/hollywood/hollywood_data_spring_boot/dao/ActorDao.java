package com.hollywood.hollywood_data_spring_boot.dao;

import com.hollywood.hollywood_data_spring_boot.dto.Actor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActorDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Actor> getActors(){
        return entityManager.createQuery("select a from Actor a",Actor.class).getResultList();
    }

}
