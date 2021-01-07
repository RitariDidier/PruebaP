package com.example.PruebaP.servicios;

import com.example.PruebaP.modelo.Item;
import com.example.PruebaP.repositorios.ItemRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Map;

@Service
public class ItemImplementacionServicio implements ItemServicio{

    @Autowired
    private ItemRepositorio iR;

    @Autowired
    private CategoryServicio categoryServicio;

    @Autowired
    private CountryServicio countryServicio;

    @Autowired
    private CurrencyServicio currencyServicio;

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
    public Item actualizarItem(Map<String,String> map, Integer id) {
        Item item = buscarItemxId(id);
        Timestamp time = new Timestamp(System.currentTimeMillis());
        item.setTittle(map.get("title"));
        item.setPrice(Integer.parseInt(map.get("price")));
        item.setCurrency_id(currencyServicio.buscarxShortname(map.get("currency")));
        item.setCountry_id(countryServicio.buscarxshortname(map.get("country")));

        item.setModified_at(time);
        return iR.save(item) ;
    }

    @Override
    public Item guardar(Map<String, String> map) {
        Item item = new Item() ;
        Timestamp time = new Timestamp(System.currentTimeMillis());
        String titulo = map.get("title");
        item.setTittle(map.get("title"));
        item.setPrice(Integer.parseInt(map.get("price")));
        item.setCurrency_id(currencyServicio.buscarxShortname(map.get("currency")));
        item.setCountry_id(countryServicio.buscarxshortname(map.get("country")));
        item.setCategory_id(categoryServicio.buscarCategoryXId(Integer.parseInt(map.get("category_id"))));
        item.setSymbol(titulo.charAt(0));
        item.setCreated_at(time);
        return iR.save(item);
    }


}
