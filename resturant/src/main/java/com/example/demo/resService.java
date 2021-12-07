package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class resService {

        private final resRepository resRepository;

        @Autowired
        public resService(resRepository resRepository) {
            this.resRepository = resRepository;
        }


        public List<res> getres(){
            return resRepository.findAll();
        }

        public res getres(String id){
            Long res_id = Long.parseLong(id);
            return resRepository.findById(res_id).orElse(null);
        }

        public res createres(res res){
            return resRepository.save(res);

        }

        public void deleteres(String id){
            Long res_id = Long.parseLong(id);
            resRepository.deleteById(res_id);

        }

        public void updaters(String id){
            Long res_id = Long.parseLong(id);
            res res = resRepository.findById(res_id).orElse(null);

            if (res != null){
                resRepository.save(res);
            }

        }

    }




