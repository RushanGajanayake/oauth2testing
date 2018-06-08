package com.example.oauth2.dao;

import com.example.oauth2.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rusha on 6/8/2018.
 */

@Repository
public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
