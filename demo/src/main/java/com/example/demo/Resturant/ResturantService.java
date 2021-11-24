package com.example.demo.Resturant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class ResturantService {

    private final ResturantRepostry resturantRepostry;

    @Autowired
    public ResturantService(ResturantRepostry resturantRepostry) {
        this.resturantRepostry = resturantRepostry;
    }

    public List<Resturant> getResturants() {
        return resturantRepostry.findAll();

    }


    public Resturant getResturant(String id) {
        Integer todo_id = Integer.parseInt(id);
        return resturantRepostry.findById(todo_id).orElse(null);
    }

    public Resturant Resturant(Resturant resturant) {

        return resturantRepostry.save(resturant);
    }

    public void deleteResturant(String id) {
        Integer resturant_id = Integer.parseInt(id);
        resturantRepostry.deleteById(resturant_id);
    }

    public void updateResturant(String id, Resturant data) {
        Integer resturant_id = Integer.parseInt(id);
        Resturant resturant = resturantRepostry.findById(resturant_id).orElse(null);


        if (resturant != null) {
            resturant.setName(data.getName());
            resturantRepostry.save(resturant);
        }
    }
}



