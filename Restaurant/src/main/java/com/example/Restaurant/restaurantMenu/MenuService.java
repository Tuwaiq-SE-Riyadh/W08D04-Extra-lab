package com.example.Restaurant.restaurantMenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    public final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public Menu createMenu(Menu m) {
        return menuRepository.save(m);
    }

    public Menu updateMenu(String id, Menu m) {
        Long Menu_id = Long.parseLong(id);
        Menu currentMenu = menuRepository.findById(Menu_id).orElse(null);
        if (currentMenu != null) {
            currentMenu.setName(m.getName());
            currentMenu.setPrice(m.getPrice());
            currentMenu.setDescription(m.getDescription());
            menuRepository.save(currentMenu);
        }
        return currentMenu;
    }

    public Menu deleteMenu(String id) {
        Long Menu_id = Long.parseLong(id);
        Menu currentMenu = menuRepository.findById(Menu_id).orElse(null);
        return currentMenu;
    }

    public Menu displayMenu(String id) {
        Long menu_id = Long.parseLong(id);
        return menuRepository.getById(menu_id);
    }

    public List<Menu> displayAllMenu() {
        return menuRepository.findAll();
    }

}
