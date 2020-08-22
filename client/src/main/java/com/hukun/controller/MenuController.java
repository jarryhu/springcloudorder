package com.hukun.controller;

import com.hukun.entity.Menu;
import com.hukun.entity.MenuVo;
import com.hukun.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    MenuFeign menuFeign;

    @GetMapping("/findAll")
    @ResponseBody
    public MenuVo findAll(@RequestParam("page") int page, @RequestParam("limit") int limit) {
        int index = (page - 1) * limit;
        MenuVo menuVo = new MenuVo();
        List<Menu> menus = menuFeign.findAll(index, limit);

        if (menus != null) {
            menuVo.setCode(0);
            menuVo.setMsg("");
            menuVo.setCount( getCount());
            menuVo.setData(menus);
        }
        return menuVo;
    }

    @GetMapping("/index")
    public String getPort() {
        return menuFeign.getPort();
    }

    @GetMapping("/redirect/{location}")
    public String redirect(@PathVariable("location") String location) {
        return location;
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") int id) {
         menuFeign.deleteById(id);
         return "redirect:/client/redirect/index";
    }
    @GetMapping("/count")
    @ResponseBody
    public int getCount()
    {
      return  menuFeign.getCount();
    }
}
