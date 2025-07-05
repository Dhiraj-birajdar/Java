package com.dhiraj.democrud.service;

import com.dhiraj.democrud.entity.User;
import com.dhiraj.democrud.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DemoService {

    private final UserRepository repository;

    public User insert(User user){
        return repository.save(user);
    }

    public User update(User user){
        var u = repository.findById(user.getId());
        u.ifPresent(u1 -> user.setId(u1.getId()));
        return repository.save(user);
    }

    public List<User> getAll() {
        return repository.findAll();
    }
}
