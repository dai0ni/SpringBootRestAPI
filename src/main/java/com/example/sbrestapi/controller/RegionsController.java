package com.example.sbrestapi.controller;

import com.example.sbrestapi.mapping.RegionsMapper;
import com.example.sbrestapi.entity.Regions;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RegionsController {

    private final RegionsMapper regionsMapper;

    public RegionsController(RegionsMapper regionsMapper) {
        this.regionsMapper = regionsMapper;
    }

    @GetMapping("/regions")
    public List<Regions> getAll() {
        return regionsMapper.findAll();
    }

    @GetMapping("/regions/{id}")
    public Regions getById(@PathVariable Long id) {
        return regionsMapper.findById(id);
    }

    @PostMapping("/regions")
    public void saveById(@RequestBody Regions region) {
        regionsMapper.save(region);
    }

    @PutMapping("/regions")
    public void updateById(@RequestBody Regions region) {
        regionsMapper.update(region);
    }

    @DeleteMapping("/regions/{id}")
    public void deleteById(@PathVariable Long id) {
        regionsMapper.deleteById(id);
    }
}
