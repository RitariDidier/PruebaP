package com.example.PruebaP.servicios;

import com.example.PruebaP.modelo.Item;


public interface ItemServicio {

    public Item buscarItemxId(int id);

    public String borrarItemXId(int id);

    public Item save(Item item);

}

