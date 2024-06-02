package com.springjpa.dao;

import com.springjpa.dto.City;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public City getCityById(int id) {
        return entityManager.find(City.class, id);
    }

    public List<City> getCitiesLimit(int limit) {
        return entityManager.createQuery("from City", City.class)
                .setMaxResults(limit)
                .getResultList();
    }

    public List<City> getCities() {
        return entityManager.createQuery("from City", City.class)
                .getResultList();
    }
}
