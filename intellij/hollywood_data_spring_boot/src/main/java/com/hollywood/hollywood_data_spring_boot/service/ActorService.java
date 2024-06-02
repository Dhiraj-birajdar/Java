package com.hollywood.hollywood_data_spring_boot.service;

import com.hollywood.hollywood_data_spring_boot.dao.ActorDao;
import com.hollywood.hollywood_data_spring_boot.dto.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    private final ActorDao actorDao;

    @Autowired
    public ActorService(ActorDao actorDao){
        this.actorDao = actorDao;
    }

    public List<Actor> getActors(){
        return actorDao.getActors();
    }

    public List<Actor> getActorsFirstName(String c) {
        return actorDao.getActors().stream().filter(a-> a.getFirstName().startsWith(c)).toList();
    }

    public List<Actor> getActorsLastName(String c) {
        return actorDao.getActors().stream().filter(a-> a.getLastName().startsWith(c)).toList();
    }
}
