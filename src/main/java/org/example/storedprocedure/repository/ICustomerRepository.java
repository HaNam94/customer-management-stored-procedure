package org.example.storedprocedure.repository;


import org.example.storedprocedure.model.Customer;

public interface ICustomerRepository {
    boolean saveWithStoredProcedure(Customer customer);
}
