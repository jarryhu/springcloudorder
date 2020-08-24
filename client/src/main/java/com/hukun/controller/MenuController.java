package com.hukun.controller;

import com.hukun.entity.Menu;
import com.hukun.entity.MenuVo;
import com.hukun.feign.MenuFeign;
import com.hukun.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    MenuFeign menuFeign;
    @Autowired
    private OrderFeign orderFeign;

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

    @GetMapping("/count")
    @ResponseBody
    public int getCount()
    {
      return  menuFeign.getCount();
    }

    @GetMapping("/prepareSave")
    public String prepareSave(Model model){
        model.addAttribute("list",menuFeign.findAllType());
        return "menu_add";
    }

    @PostMapping("/save")
    public String save(Menu menu){
        menuFeign.save(menu);
        return "redirect:/account/redirect/menu_manage";
    }

    @GetMapping("/findById/{id}")
    public String findById(@PathVariable("id") long id,Model model){
        model.addAttribute("list",menuFeign.findAllType());
        model.addAttribute("menu",menuFeign.findById(id));
        return "menu_update";
    }

    @PostMapping("/update")
    public String update(Menu menu){
        menuFeign.update(menu);
        return "redirect:/account/redirect/menu_manage";
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
        orderFeign.deleteByMid(id);
        menuFeign.deleteById(id);
        return "redirect:/account/redirect/menu_manage";
    }
}
