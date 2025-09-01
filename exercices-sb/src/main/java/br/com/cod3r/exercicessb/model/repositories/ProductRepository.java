package br.com.cod3r.exercicessb.model.repositories;

import br.com.cod3r.exercicessb.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    public Iterable<Product> findByNameContainingIgnoreCase(String name);
}
