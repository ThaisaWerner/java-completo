package br.com.cod3r.exercicessb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorChallengeController {

    // Will call the urls: /calculator/sum/10/20 and calculator/subtract?a=100&b=39

    @GetMapping("/sum/{a}/{b}")
    public int sum(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
        return a - b;
    }
}
