package com.example.PruebaP.controladores;

import com.example.PruebaP.modelo.Item;

import com.example.PruebaP.servicios.ItemServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.ManagedMap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    public Map<String,String> borrarItemXid(@PathVariable Integer id){
        Map<String,String> map = new HashMap<String, String>();
        map.put("mensaje",iS.borrarItemXId(id));

        return map;
    }

    @PutMapping("/act/{id}")
    public Item actualizar(@PathVariable Integer id,@RequestBody Map<String, String> map){

        return iS.actualizarItem(map, id);
    }

    @PostMapping("/agregar_item")
    public Map<String,Integer> guardar (@RequestBody Map<String, String> map){
        Map<String,Integer> map2 = new HashMap<String, Integer>();
        map2.put("id",iS.guardar(map).getId());
        //String msg = iS.guardar(map).getId()+"";
        return map2;
    }

}
