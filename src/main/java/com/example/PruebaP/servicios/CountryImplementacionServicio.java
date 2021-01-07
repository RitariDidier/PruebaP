package com.example.PruebaP.servicios;

import com.example.PruebaP.modelo.Country;

import com.example.PruebaP.repositorios.CountryRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CountryImplementacionServicio implements CountryServicio{

    @Autowired
    private CountryRepositorio cyR;

    @Override
    public Country buscarxshortname(String shortname) {
        return cyR.findByShortname(shortname).orElse(null);
    }
}
