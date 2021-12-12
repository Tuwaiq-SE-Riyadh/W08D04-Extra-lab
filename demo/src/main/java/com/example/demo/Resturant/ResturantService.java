package com.example.demo.Resturant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResturantService {

    private final ResturantRepository resturantRepository;

    @Autowired
    public ResturantService(ResturantRepository resturantRepository) {
        this.resturantRepository = resturantRepository;
    }


    public List getAllMenus(){
        return resturantRepository.findAll();
    }

    public Resturant getMenue(String id){
        Long menue_id = Long.parseLong(id);
        return resturantRepository.findById(menue_id).orElse(null);
    }

    public Resturant addMenue(Resturant resturant){
        return resturantRepository.save(resturant);
    }

    public void deleteMenue(String id){
        Long menue_id = Long.parseLong(id);
        resturantRepository.deleteById(menue_id);
    }

    public void updateMenue(String id, Resturant data){
        Long menue_id = Long.parseLong(id);
        Resturant resturant = resturantRepository.findById(menue_id).orElse(null);
        if (resturant != null){
            resturant.setName(data.getName());
            resturantRepository.save(resturant);
        }
    }
}
