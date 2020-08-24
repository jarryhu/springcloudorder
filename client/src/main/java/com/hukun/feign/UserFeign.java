package com.hukun.feign;

import com.hukun.entity.UserEntity;
import com.hukun.entity.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(value = "user")
public interface UserFeign {

    @GetMapping("/user/index")
    public String getPort();

    @GetMapping("/user/findAll/{offset}/{limit}")
    public UserVo queryAllByLimit(@PathVariable("offset") int page,
                                        @PathVariable("limit") int limit) ;
}
