package com.primes_service.primesservice.controller;


import com.primes_service.primesservice.service.PrimeService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesController {
    PrimeService primeService = new PrimeService();

    public PrimesController(PrimeService primeService) {
        this.primeService = primeService;
    }
    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable int n) {
        return primeService.isPrime(n);
    }
}
