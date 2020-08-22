package com.hukun.feign;

import com.hukun.entity.Menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "menu")
public interface MenuFeign {

    @GetMapping("/menu/findAll/{index}/{limit}")
    public List<Menu> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit);

    @GetMapping("/menu/index")
    public String getPort();

    @GetMapping("/menu/count")
    public int getCount();

    @GetMapping("/menu/deleteById/{id}")
    public int deleteById(@PathVariable("id") int id);
}
