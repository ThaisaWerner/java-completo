package br.com.cod3r.exercicessb.model.repositories;

import br.com.cod3r.exercicessb.model.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
