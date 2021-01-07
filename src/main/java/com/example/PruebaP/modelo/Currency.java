package com.example.PruebaP.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @NotNull(message = "shortname no debe ser nulo")
    @Size(max=3)
    private String shortName;


    @NotNull(message = "longname no debe ser nulo")
    @Size(max=100)
    private String longName;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "currency_id" ,orphanRemoval = true)
    @JsonIgnoreProperties("currency")
    private List <Item> items;


    public Currency() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
