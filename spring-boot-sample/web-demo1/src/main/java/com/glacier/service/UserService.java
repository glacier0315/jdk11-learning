package com.glacier.service;


import com.glacier.domain.User;

import javax.servlet.http.HttpServletResponse;
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

    void export(User user, HttpServletResponse response);
}
