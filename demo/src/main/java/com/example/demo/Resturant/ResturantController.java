package com.example.demo.Resturant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "resturant")
public class ResturantController {

    private final ResturantService resturantService;

    @Autowired
    public ResturantController(ResturantService resturantService) {
        this.resturantService = resturantService;
    }

        @GetMapping
    public List<Resturant> getAllMenus(){
        return resturantService.getAllMenus();
    }

    @GetMapping("/{id}")
    public Resturant getMenue(@PathVariable String id){
        return resturantService.getMenue(id);
    }

    @PostMapping
    public Resturant addMenue(@RequestBody Resturant resturant){
        return resturantService.addMenue(resturant);
    }

    @DeleteMapping("/{id}")
    public void deleteMenue(@PathVariable String id){
        resturantService.deleteMenue(id);
    }

    @PutMapping("/{id}")
    public void updateMenue(@PathVariable String id, @RequestBody Resturant resturant){
        resturantService.updateMenue(id,resturant);
    }

}
