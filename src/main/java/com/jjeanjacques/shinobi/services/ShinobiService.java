package com.jjeanjacques.shinobi.services;

import com.jjeanjacques.shinobi.models.Shinobi;
import com.jjeanjacques.shinobi.repository.ShinobiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShinobiService {

    @Autowired
    private ShinobiRepository shinobiRepository;

    public List<Shinobi> getAllShinobis() {
        return shinobiRepository.findAll();
    }
}
