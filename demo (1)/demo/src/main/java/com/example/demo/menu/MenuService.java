package com.example.demo.menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }


    public List<Menu> getMenus(){
        return menuRepository.findAll();
    }

    public Menu getMenu(String id){
        Long user_id = Long.parseLong(id);
        return menuRepository.findById(user_id).orElse(null);
    }

    public Menu createMenu(Menu menu){
        return menuRepository.save(menu);

    }

    public void deleteMenu(String id){
        Long menu_id = Long.parseLong(id);
        menuRepository.deleteById(menu_id);

    }

    public void updateUser(String id, Menu data){
        Long menu_id = Long.parseLong(id);
        Menu menu = menuRepository.findById(menu_id).orElse(null);

        if (menu != null){
            menu.setName(data.getName());
            menu.setPrice(data.getPrice());
            menu.setDescription(data.getDescription());
            menuRepository.save(data);
        }

    }
}

