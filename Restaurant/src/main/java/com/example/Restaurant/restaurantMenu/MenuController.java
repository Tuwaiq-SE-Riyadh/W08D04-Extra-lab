package com.example.Restaurant.restaurantMenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Menu")
public class MenuController {

    public final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

//Add new menu
//Delete menu
//Update menu
//display all menus
//display a menu


    @PostMapping()
    public Menu createMenu(Menu m) {
        return menuService.createMenu(m);
    }

    @DeleteMapping("/{id}")
    public Menu deleteMenu(@PathVariable String id) {
        return menuService.deleteMenu(id);
    }

    @PutMapping()
    public Menu updateMenu(String id, Menu m) {
        return menuService.updateMenu(id, m);
    }

    @GetMapping()
    public Menu getMenu(@PathVariable String id) {
        return menuService.displayMenu(id);
    }

    @GetMapping
    public List<Menu> getAllMenu(@PathVariable String id) {
        return menuService.displayAllMenu();
    }


}
