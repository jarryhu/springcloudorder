package com.hukun.controller;

import com.hukun.entity.Menu;
import com.hukun.entity.Type;
import com.hukun.repository.MenuRepository;
import com.hukun.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    TypeRepository typeRepository;

    @GetMapping("/findAll/{index}/{limit}")
    public List<Menu> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit) {
        return menuRepository.findAll(index, limit);
    }

    @GetMapping("/count")
    public int getCount() {
        return menuRepository.count();
    }
    @GetMapping("/findAllType")
    public List<Type> findAllType(){
        return typeRepository.findAllType();
    }

    @PostMapping("/save")
    public void save(@RequestBody Menu menu){
        menuRepository.save(menu);
    }

    @GetMapping("/findById/{id}")
    public Menu findById(@PathVariable("id") long id){
        return menuRepository.findById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Menu menu){
        menuRepository.update(menu);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        menuRepository.deleteById(id);
    }


}
