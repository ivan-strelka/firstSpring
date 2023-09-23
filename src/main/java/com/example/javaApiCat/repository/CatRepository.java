package com.example.javaApiCat.repository;

import com.example.javaApiCat.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, String> {

}