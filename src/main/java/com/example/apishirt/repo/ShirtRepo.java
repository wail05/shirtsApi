package com.example.apishirt.repo;

import com.example.apishirt.entity.Shirt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShirtRepo extends JpaRepository<Shirt, Integer> {
    List<Shirt> findAll();
    Shirt findById(int id);
}

