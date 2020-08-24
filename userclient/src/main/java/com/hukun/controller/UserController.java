package com.hukun.controller;

import com.hukun.dao.UserDao;

import com.hukun.entity.UserEntity;
import com.hukun.entity.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String getPort() {
        return this.port;
    }

    @GetMapping("/findAll/{offset}/{limit}")
    public UserVo queryAllByLimit(@PathVariable("offset") int offset,
                                        @PathVariable("limit") int limit) {
        UserVo userVo = new UserVo();
       int page =  (offset-1)*limit;
        List<UserEntity> userEntitys = userDao.queryAllByLimit(page, limit);
        if (userEntitys != null) {
            userVo.setCode(0);
            userVo.setCount(userDao.count());
            userVo.setData(userEntitys);
            userVo.setMsg("");
        }
        return userVo;
    }

    @GetMapping("/count")
    public int count() {
        return userDao.count();
    }
}
