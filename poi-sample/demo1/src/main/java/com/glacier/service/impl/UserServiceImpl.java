package com.glacier.service.impl;

import com.glacier.domain.User;
import com.glacier.service.UserService;
import org.apache.commons.lang3.StringUtils;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * date 2021-05-07 17:31
 *
 * @author glacier
 * @version 1.0
 */
public class UserServiceImpl implements UserService {
    
    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>(150);
        User user = null;
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 150; i++) {
            user = new User();
            user.setId(UUID.randomUUID().toString().replace("-", ""));
            user.setUsername("user_" + i);
            user.setPassword("passwd_" + i);
            user.setNickname("昵称_" + i);
            user.setBirthday(LocalDate.now());
            user.setIdCard("123748909876543254654785" + i);
            user.setSex(random.nextInt(1));
            user.setDuty("duty_" + i);
            user.setJoinDate(LocalDate.now());
            user.setDoubleData(random.nextDouble() + random.nextInt(1));
    
            users.add(user);
        }
        return users;
    }

    @Override
    public List<User> findList(User user) {
        if (user != null
                && StringUtils.isNotBlank(user.getUsername())) {
            System.out.println(user);
        }
        return this.findAll()
                .parallelStream()
                .limit(10)
                .collect(Collectors.toList());
    }
}
