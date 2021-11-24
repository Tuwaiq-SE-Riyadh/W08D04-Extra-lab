package com.example.demo2.Menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "menu")
public class MenuController {

    private  final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping
    public List<Menu> getMenus(@RequestParam(required = false) String filter){
        return menuService.getMenus();
    }

    @PostMapping
    public void addMenu(@RequestBody Menu menu){
        menuService.createMenu(menu);
    }

    @GetMapping("/{id}")
    public Menu getMenu(@PathVariable String id){
        return menuService.getMenu(id);
    }


    @DeleteMapping("/{id}")
    public void delMenu(@PathVariable String id){
        menuService.deleteMenu(id);
    }

    @PutMapping("/{id}")
    public void updateMenu(@PathVariable String id, @RequestBody Menu data){
        menuService.updateMenu(id, data);
    }

}



