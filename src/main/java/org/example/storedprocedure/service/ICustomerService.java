package org.example.storedprocedure.service;


import org.example.storedprocedure.model.Customer;

public interface ICustomerService {
    boolean saveWithStoredProcedure(Customer customer);
}
