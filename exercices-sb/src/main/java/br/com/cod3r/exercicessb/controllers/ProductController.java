package br.com.cod3r.exercicessb.controllers;

import br.com.cod3r.exercicessb.model.entities.Product;
import br.com.cod3r.exercicessb.model.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    //Using POST and PUT in the same method
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Product newProduct(@Valid Product product) {
         productRepository.save(product);
         return product;
    }

    @GetMapping
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping(path="/{id}")
    public Optional<Product> getProductById(@PathVariable int id) {
        return productRepository.findById(id);
    }

//    @PutMapping
//    public Product updateProduct(@Valid Product product) {
//        productRepository.save(product);
//        return product;
//    }

    @DeleteMapping(path="/{id}")
    public void deleteProduct(@PathVariable int id) {
        productRepository.deleteById(id);
    }
}
