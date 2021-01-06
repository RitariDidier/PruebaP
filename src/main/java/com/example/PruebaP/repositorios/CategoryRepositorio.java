package com.example.PruebaP.repositorios;

import com.example.PruebaP.modelo.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepositorio extends JpaRepository<Category,Integer> {

}
