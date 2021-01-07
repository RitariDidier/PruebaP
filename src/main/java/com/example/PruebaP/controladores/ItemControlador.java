package com.example.PruebaP.controladores;

import com.example.PruebaP.modelo.Item;

import com.example.PruebaP.servicios.ItemServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Item")
public class ItemControlador {

    @Autowired
    private ItemServicio iS;


    @GetMapping("/{id}")
    public Item buscarItemXid(@PathVariable Integer id){
        return iS.buscarItemxId(id);

    }

    @DeleteMapping("/{id}")
    public String borrarItemXid(@PathVariable Integer id){

        return iS.borrarItemXId(id);
    }



    @PostMapping
    public ResponseEntity <Item> save(@RequestBody Item item){

        Item obj = iS.save(item);
        return new ResponseEntity<Item>(obj, HttpStatus.OK);

    }

}
