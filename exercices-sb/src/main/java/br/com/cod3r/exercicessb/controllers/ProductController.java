package br.com.cod3r.exercicessb.controllers;

import br.com.cod3r.exercicessb.model.entities.Product;
import br.com.cod3r.exercicessb.model.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public @ResponseBody Product newProduct(@RequestParam String name, @RequestParam double price, @RequestParam double discount) {
         Product product = new Product(name, price, discount);
         productRepository.save(product);
         return product;
    }
}
