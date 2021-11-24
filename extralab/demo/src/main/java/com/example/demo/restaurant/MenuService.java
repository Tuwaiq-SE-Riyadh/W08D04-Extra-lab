package com.example.demo.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {


    private final menuRepository  menurepository;
    @Autowired
    public MenuService(menuRepository menurepository) {
        this.menurepository = menurepository;
    }


    public List<Menu> getMeneus(){

        return  menurepository.findAll();
    }


    public Menu addMeneu(Menu menu){

        return menurepository.save(menu);
    }

    public Menu getMenu(String id){
        int user_id = Integer.parseInt(id);
        return menurepository.findById(user_id).orElse(null);
    }
}
