package com.glacier;

import com.glacier.service.impl.UserServiceImpl;

/**
 * date 2021-05-07 17:28
 *
 * @author glacier
 * @version 1.0
 */
public class App {
    
    public static void main(String[] args) {
        var userService = new UserServiceImpl();
        userService.findAll()
                .forEach(System.out::println);
    }
}
