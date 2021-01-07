package com.example.PruebaP.servicios;

import com.example.PruebaP.modelo.Currency;
import com.example.PruebaP.repositorios.CurrencyRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyImplementacionServicio implements CurrencyServicio{

    @Autowired
    private CurrencyRepositorio cR;

    @Override
    public Currency buscarxShortname(String shortname) {

        return cR.findByShortName(shortname).orElse(null);
    }
}
