package com.example.PruebaP.repositorios;

import com.example.PruebaP.modelo.Currency;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CurrencyRepositorio extends JpaRepository<Currency,Integer> {

    Optional<Currency> findByShortName(String shortName);

}

