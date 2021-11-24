package com.example.demo.Menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="menus")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService){ this.menuService = menuService; }

    @GetMapping
    public List<Menu> getMenus(){
        return menuService.getMenus();
    }

    @GetMapping("/{id}")
    public Menu getMenu(@PathVariable String id){
        return menuService.getMenu(id);
    }

    @PostMapping("/add")
    public Menu createMenu(@RequestBody Menu menu){ return menuService.createMenu(menu); }

    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable String id){
        menuService.deleteMenu(id);
    }

    @PutMapping("/{id}")
    public void updateMenu(@PathVariable String id, @RequestBody Menu data){ menuService.updateMenu(id, data); }
}
