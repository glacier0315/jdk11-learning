package com.glacier.service;


import com.glacier.domain.User;

import java.util.List;

/**
 * date 2021-05-07 17:31
 *
 * @author glacier
 * @version 1.0
 */
public interface UserService {

    List<User> findAll();

    List<User> findList(User user);

}
