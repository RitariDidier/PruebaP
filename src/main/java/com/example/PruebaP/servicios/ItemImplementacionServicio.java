package com.example.PruebaP.servicios;

import com.example.PruebaP.modelo.Item;
import com.example.PruebaP.repositorios.ItemRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemImplementacionServicio implements ItemServicio{
    @Autowired
    private ItemRepositorio iR;

    @Override
    public Item buscarItemxId(int id) {
        return iR.findById(id).orElse(null);
    }
}
