package com.example.demo.menu;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="menus")
public class MenuContoller {

    private final MenuService menuService;

    @Autowired
    public MenuContoller(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping
    public List<Menu> getUsers(){
        return menuService.getMenus();

    }

    @GetMapping("/{id}")
    public Menu getUser(@PathVariable String id){
        return menuService.getMenu(id);

    }

    @PostMapping
    public Menu createUser(@RequestBody Menu menu){
        return menuService.createMenu(menu);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        menuService.deleteMenu(id);

    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable String id, @RequestBody Menu data){
        menuService.updateUser(id, data);
    }
}
