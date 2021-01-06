package com.example.PruebaP.controladores;

import com.example.PruebaP.modelo.Item;

import com.example.PruebaP.servicios.ItemServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Item")
public class ItemControlador {

    @Autowired
    private ItemServicio iS;


    @GetMapping("/{id}")
    public Item buscarItemXiId(@PathVariable Integer id){
        return iS.buscarItemxId(id);

    }
}
