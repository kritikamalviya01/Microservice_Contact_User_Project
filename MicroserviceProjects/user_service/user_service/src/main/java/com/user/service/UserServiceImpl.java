package com.user.service;

import com.user.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<User> list = List.of(
            new User(101,"Kritika","123456789"),
            new User(102,"Kinesh ","234567891"),
            new User(103,"Aneri ","345678912"),
            new User(104,"Payal ","456789123")
            );

    @Override
    public User getUser(long id) {
        return list.stream().filter(u -> u.getId()==id).findAny().orElse(null);
    }
}
