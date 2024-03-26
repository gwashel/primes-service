package com.primes_service.primesservice.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeServiceTest {
    PrimeService primeService = new PrimeService();


    @Test
    void _45_is_not_prime() {
        assertFalse(primeService.isPrime(45));
    }

    @Test
    void _7_is_prime() {
        assertTrue(primeService.isPrime(7));
    }
    @Test
    void isPrime() {
    }
}