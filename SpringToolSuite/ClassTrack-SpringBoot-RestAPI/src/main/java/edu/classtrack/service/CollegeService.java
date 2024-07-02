package edu.classtrack.service;

import java.util.List;

public interface CollegeService<T> {

    public List<T> findAll();

    public T findById(Long id);

    public T save(T t);

    public T update(T t);

    public String delete(Long id);
}
