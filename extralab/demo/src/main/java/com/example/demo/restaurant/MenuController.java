package com.example.demo.restaurant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "restaurant")
public class MenuController {

    private final MenuService menuservice;


    @Autowired
    public MenuController(MenuService menuservice) {
        this.menuservice = menuservice;
    }


    @GetMapping
    public List<Menu> getMeneus(){

        return menuservice.getMeneus();
    }

    @PostMapping
    public Menu addMenu(@RequestBody Menu menu){

        return menuservice.addMeneu(menu);
    }

    @GetMapping("/{id}")
    public Menu getMenu(@PathVariable String id){
        return menuservice.getMenu(id);
    }

}
