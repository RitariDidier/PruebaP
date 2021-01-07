package com.example.PruebaP.repositorios;


import com.example.PruebaP.modelo.Country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepositorio extends JpaRepository<Country, Integer> {

    Optional<Country> findByShortName(String shortName);
}