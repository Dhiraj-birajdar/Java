package edu.classtrack.repository;

import java.util.List;

public interface CollegeRepository<T> {

    public List<T> findAll();

    public T findById(Long id);

    public T save(T t);

    public T update(T t);

    public String delete(Long id);

}
