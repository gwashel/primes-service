package com.primes_service.primesservice.service;

import com.primes_service.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {
    boolean register(Customer customer) throws IOException;

}

