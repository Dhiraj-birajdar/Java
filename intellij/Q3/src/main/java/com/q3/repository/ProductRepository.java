package com.q3.repository;

import com.q3.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepository {

    private final EntityManager manager;

    @Transactional
    public Status update(Product p){
        if(manager.find(Product.class,p.getId())==null)
            return Status.NOT_EXISTS;
        manager.merge(p);
        return Status.SUCCESS;


    }

    @Transactional
    public void add(Product p){
        manager.persist(p);
    }

    public List<Product> getAll(){
        return manager.createQuery("select p from Product p").getResultList();
    }

}


