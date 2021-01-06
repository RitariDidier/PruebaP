package com.example.PruebaP.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(max=100)
    @NotNull(message = "tittle no debe ser nulo")
    private String tittle;

    @NotNull(message = "price no debe ser nulo")
    private double price;

    @Size(max=1)
    @NotNull(message = "symbol no debe ser nulo")
    private char symbol;

    @NotNull(message = "created_at no debe ser nulo")
    private Timestamp created_at;
    private Timestamp modified_at;

    @ManyToOne
    @JoinColumn(name = "currency_id")
    @JsonIgnoreProperties("items")
    private Currency currency_id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonIgnoreProperties("items")
    private Category category_id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    @JsonIgnoreProperties("items")
    private Country country_id;

    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getModified_at() {
        return modified_at;
    }

    public void setModified_at(Timestamp modified_at) {
        this.modified_at = modified_at;
    }

    public Currency getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(Currency currency_id) {
        this.currency_id = currency_id;
    }

    public Category getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }

    public Country getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Country country_id) {
        this.country_id = country_id;
    }
}
