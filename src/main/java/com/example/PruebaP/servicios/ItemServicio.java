package com.example.PruebaP.servicios;

import com.example.PruebaP.modelo.Item;

import java.util.Map;


public interface ItemServicio {

    public Item buscarItemxId(int id);

    public String borrarItemXId(int id);

    public Item actualizarItem(Map<String,String> map,Integer id);

    public Item guardar(Map<String,String> map);

    //public Item save(Item item);

}

