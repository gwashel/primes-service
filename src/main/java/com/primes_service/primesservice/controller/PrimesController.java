package com.primes_service.primesservice.controller;


import com.primes_service.primesservice.service.PrimesService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesController {
    PrimesService primesService = new PrimesService();

    public PrimesController(PrimesService primeService) {
        this.primesService = primeService;
    }
    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable int n) {
        return primesService.isPrime(n);
    }
}
