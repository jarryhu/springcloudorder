package com.hukun.controller;

import com.hukun.entity.Menu;
import com.hukun.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String getPort() {
        return this.port;
    }

    @Autowired
    MenuRepository menuRepository;

    @GetMapping("/findAll/{index}/{limit}")
    public List<Menu> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit) {
        return menuRepository.findAll(index, limit);
    }

    @GetMapping("/count")
    public int getCount() {
        return menuRepository.count();
    }

    @GetMapping("/deleteById/{id}")
    public int deleteById(@PathVariable("id") int id)
    {
        return menuRepository.deleteById(id);
    }


}
