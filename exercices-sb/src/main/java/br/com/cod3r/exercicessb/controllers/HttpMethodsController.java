package br.com.cod3r.exercicessb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/methods")
public class HttpMethodsController {

    //The GET request is one of the most common HTTP methods and is used to retrieve information or resources from a server.
    @GetMapping
    public String get() {
        return "GET request";
    }

    // The POST request is an HTTP method primarily used to send data to a server to create or add a new resource.
    @PostMapping
    public String post() {
        return "POST request";
    }

    //The HTTP PUT method is used to update an existing resource on the server.
    @PutMapping
    public String put() {
        return "PUT request";
    }

    //The main function of @PatchMapping is to handle partial update of a resource.
    @PatchMapping
    public String patch() {
        return "PATCH request";
    }

    //The HTTP DELETE method is used to remove an existing resource on the server.
    @DeleteMapping
    public String delete() {
        return "DELETE request";
    }

}
