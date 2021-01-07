package com.example.PruebaP.servicios;

import com.example.PruebaP.modelo.Category;
import com.example.PruebaP.modelo.Item;
import com.example.PruebaP.repositorios.CategoryRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryImplementacionServicio implements CategoryServicio {

    @Autowired
    private CategoryRepositorio catR;


    @Override
    public Category buscarCategoryXId(Integer id) {
        return catR.findById(id).orElse(null);
    }
}
