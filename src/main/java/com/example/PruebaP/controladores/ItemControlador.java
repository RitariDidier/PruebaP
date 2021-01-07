package com.example.PruebaP.controladores;

import com.example.PruebaP.modelo.Item;

import com.example.PruebaP.servicios.ItemServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    @PutMapping("/act/{id}")
    public Item actualizar(@PathVariable Integer id,@RequestBody Map<String, String> map){

        return iS.actualizarItem(map, id);
    }

    @PostMapping("/agregar_item")
    public String guardar (@RequestBody Map<String, String> map){

        String msg = iS.guardar(map).getId()+"";


        return iS.guardar(map).getId()+"";

    }

}
