package com.example.PruebaP.repositorios;


import com.example.PruebaP.modelo.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepositorio extends JpaRepository<Country,Integer> {
}