package com.example.javaApiCat.controller;

import com.example.javaApiCat.dto.CatDto;
import com.example.javaApiCat.entity.Cat;
import com.example.javaApiCat.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService service;

    @PostMapping
    public Cat save(@RequestBody CatDto cat) {
        return service.save(cat);
    }

    @GetMapping
    public Iterable<Cat> getAll() {
        return service.getAll();
    }

}