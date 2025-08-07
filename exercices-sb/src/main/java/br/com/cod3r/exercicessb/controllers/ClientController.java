package br.com.cod3r.exercicessb.controllers;

import br.com.cod3r.exercicessb.models.Client;
import org.springframework.web.bind.annotation.*;

// Tells that this class handles HTTP requests and all methods in it will return JSON responses. This is useful for creating RESTful APIs where the main goal is to expose data to other services or clients such as mobile applications or frontend applications to consume.
@RestController
// Maps HTTP requests to the specified path. In this case, it maps all requests starting with "/clients" to this controller. This means that any HTTP request that starts with "/clients" will be handled by this controller. It also defines the base URL for all methods in this controller. For example, if the application is running on `http://localhost:8080`, a request to `http://localhost:8080/clients/any` will be handled by the `getClient` method. This avoid repetition of the path in each method mapping.
@RequestMapping("/clients")
public class ClientController {

    // Maps HTTP GET requests to the specified path. In this case, it maps GET requests to "/clients/any" to this method. This means that when a GET request is made to "/clients/any", this method will be invoked.
    @GetMapping("/any")
    public Client getClient() {
        return new Client(28, "Pedro", "123.456.789-00");
    }

    // The id parameter is extracted from the URL path using the @PathVariable annotation. So the id passed in the URL will be used as the value for this parameter. For example, if a request is made to "/clients/1", the id parameter will be 1.
    @GetMapping("/{id}")
    public Client getClientById1(@PathVariable int id) {
        return new Client(id, "Maria", "987.654.321-00");
    }

    // The @RequestParam annotation is used to extract query parameters from the URL. In this case, it extracts the "id" parameter from the query string. For example, if a request is made to "/clients?id=5", the id parameter will be 5.
    @GetMapping
    public Client getClientById2 (@RequestParam(name = "id") int id) {
        return new Client(id, "João", "111.222.333-44");
    }
}
