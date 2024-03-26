package com.primes_service.primesservice.service;


import org.springframework.stereotype.Service;

@Service
public class PrimeService implements IPrimeService {

    @Override
    public boolean isPrime(long number) {
        if (number == 2) {
            return true;
        }
        for (long i = 2L; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
