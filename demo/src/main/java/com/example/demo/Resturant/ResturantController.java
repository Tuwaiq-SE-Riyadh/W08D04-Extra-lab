package com.example.demo.Resturant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path="resturant")
public class ResturantController {

    private ResturantService resturantService;

    @Autowired
    public ResturantController(ResturantService resturantService) {
        this.resturantService = resturantService;
    }

    @GetMapping

    public List<Resturant> getResturants() {
        return resturantService.getResturants();
    }
    @GetMapping("/{id}")
    public Resturant getResturant(@PathVariable String id){
        return resturantService.getResturant(id);

    }
    @PostMapping
    // --------create new todo
    public Resturant createTodo(@RequestBody Resturant resturant){
        return resturantService.Resturant(resturant);
    }

    //
    @DeleteMapping("/{id}")
    //-------todo/id delete  todo
    public void deleteResturant(@PathVariable String id){
        resturantService.deleteResturant(id);

    }
    @PutMapping("/{id}")
    public void updateResturant(@PathVariable String id, @RequestBody Resturant data)
    {
        resturantService.updateResturant(id,data);
    }

}
