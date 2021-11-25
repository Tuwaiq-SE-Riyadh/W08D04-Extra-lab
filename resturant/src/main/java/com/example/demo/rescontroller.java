package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="rest")
public class rescontroller {




        private final resService resService;

        @Autowired
        public rescontroller(resService resService) {
            this.resService = resService;
        }

        @GetMapping
        public List<res> getres(){
            return resService.getres();

        }

        @GetMapping("/{id}")
        public res getUser(@PathVariable String id){
            return resService.getres(id);

        }

        @PostMapping
        public res createuser(@RequestBody res res){
            return resService.createres(res);
        }

        @DeleteMapping("/{id}")
        public void deleteuser(@PathVariable String id){
            resService.deleteres(id);

        }

        @PutMapping("/{id}")
        public void updateuser(@PathVariable String id){
            resService.updaters(id);
        }
    }

