package com.example.PruebaP.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Currency {

    @Id
    private int id;


    @NotNull(message = "shortname no debe ser nulo")
    @Size(max=3)
    private String shortname;


    @NotNull(message = "longname no debe ser nulo")
    @Size(max=100)
    private String longname;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "currency_id" ,orphanRemoval = true)
    @JsonIgnoreProperties("currency")
    private List <Item> items;

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public Currency() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
