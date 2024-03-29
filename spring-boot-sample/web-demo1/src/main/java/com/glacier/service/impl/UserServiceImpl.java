package com.glacier.service.impl;

import com.glacier.domain.User;
import com.glacier.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
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
@Service("userService")
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    private final Set<User> users = new HashSet<>(200);

    @PostConstruct
    public void init() {
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

            this.users.add(user);
        }
    }


    @Override
    public List<User> findAll() {
        return new ArrayList<>(this.users);
    }

    @Override
    public List<User> findList(User user) {
        if (user != null
                && StringUtils.isNotBlank(user.getUsername())) {
            LOGGER.info("user {}", user);
        }
        return this.users.parallelStream()
                .limit(10)
                .collect(Collectors.toList());
    }

    @Override
    public void export(User user, HttpServletResponse response) {
        List<User> users = this.findList(user);
        // 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        try {
            // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
            String fileName = URLEncoder.encode("测试", "UTF-8")
                    .replaceAll("\\+", "%20");
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
            // EasyExcel.write(response.getOutputStream(), User.class).sheet("模板").doWrite(users);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
