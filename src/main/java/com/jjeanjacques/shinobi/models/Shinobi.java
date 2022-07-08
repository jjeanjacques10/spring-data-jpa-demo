package com.jjeanjacques.shinobi.models;

import com.jjeanjacques.shinobi.models.enums.Village;

import javax.persistence.*;


@Entity
@Table(name = "shinobi")
public class Shinobi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Set strategy to auto_increment
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Enumerated(EnumType.STRING) // or EnumType.ORDINAL
    private Village village;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }
}
