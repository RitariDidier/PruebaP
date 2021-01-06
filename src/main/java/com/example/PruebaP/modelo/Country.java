package com.example.PruebaP.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(max=3)
    @NotNull(message = "shortname no debe ser nulo")
    private char shortname;

    @Size(max=100)
    @NotNull(message = "longname no debe ser nulo")
    private String longname;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "country_id" ,orphanRemoval = true)
    @JsonIgnoreProperties("country")
    private List<Item> items;

    public Country() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getShortname() {
        return shortname;
    }

    public void setShortname(char shortname) {
        this.shortname = shortname;
    }

    public String getLongname() {
        return longname;
    }

    public void setLongname(String longname) {
        this.longname = longname;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
