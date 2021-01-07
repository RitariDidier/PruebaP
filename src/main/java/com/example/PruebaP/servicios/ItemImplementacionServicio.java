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

    @Override
    public String borrarItemXId(int id) {
        String msg = "se elimino correctamente";
        iR.deleteById(id);
        return msg;
    }

    @Override
    public Item save(Item item) {
        return iR.save(item);
    }

}
