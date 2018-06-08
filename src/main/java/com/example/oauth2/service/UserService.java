package com.example.oauth2.service;

import com.example.oauth2.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rusha on 6/8/2018.
 */

@Service
public interface UserService {

    User save(User user);

    List<User> findAll();

    void delete (Long id);
}
