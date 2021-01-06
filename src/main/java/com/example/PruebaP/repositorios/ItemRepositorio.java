package com.example.PruebaP.repositorios;

import com.example.PruebaP.modelo.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepositorio extends JpaRepository<Item,Integer> {
}
