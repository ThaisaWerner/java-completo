package br.com.cod3r.exercicessb.controllers;

import br.com.cod3r.exercicessb.models.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
