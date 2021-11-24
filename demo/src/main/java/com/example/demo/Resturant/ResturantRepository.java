package com.example.demo.Resturant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResturantRepository extends JpaRepository<Resturant, Long> {
}
