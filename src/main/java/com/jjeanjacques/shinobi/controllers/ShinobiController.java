package com.jjeanjacques.shinobi.controllers;


import com.jjeanjacques.shinobi.models.Shinobi;
import com.jjeanjacques.shinobi.services.ShinobiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shinobi")
public class ShinobiController {

    @Autowired
    private ShinobiService shinobiService;

    @GetMapping
    public ResponseEntity<List<Shinobi>> getAll() {
        return ResponseEntity.ok(shinobiService.getAllShinobis());
    }
}
