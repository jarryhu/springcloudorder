package com.hukun.controller;

import com.hukun.entity.UserEntity;
import com.hukun.entity.UserVo;
import com.hukun.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
 private UserFeign userFeign;

    @GetMapping("/index")
    @ResponseBody
    public String getPort()
    {
        return userFeign.getPort();
    }
    @GetMapping("/findAll")
    @ResponseBody
    public UserVo queryAllByLimit(@RequestParam("page") int page,
                                  @RequestParam("limit") int limit)
    {
        return  userFeign.queryAllByLimit(page,limit);
    }

    @GetMapping("/redirect/{location}")
    public String redirect(@PathVariable("location") String location) {
        return location;
    }
    @GetMapping("/")
    public String redirect2() {
        return "login";
    }
}
