package com.primes_service.primesservice.repositories;

import com.primes_service.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationRepository {
    boolean save (Customer customer) throws IOException;
    Customer findByUsername(String username) throws IOException;
}
