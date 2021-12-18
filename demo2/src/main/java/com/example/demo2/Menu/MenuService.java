package com.example.demo2.Menu;


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
        int todo_id = Integer.valueOf(id);
        return menuRepository.findById(todo_id).orElse(null);
    }

    public Menu createMenu(Menu menu){
        return menuRepository.save(menu);
    }

    public void deleteMenu(String id){
        int todo_id = Integer.valueOf(id);
        menuRepository.deleteById(todo_id);

    }

    public void updateMenu(String id, Menu data){

        int todo_id = Integer.valueOf(id);
        Menu menu = menuRepository.findById(todo_id).orElse(null);

        if (menu != null){
            menu.setName(data.getName());
            menu.setPrice(data.getPrice());
            menu.setDescription(data.getDescription());
            menuRepository.save(menu);
        }
    }

}









