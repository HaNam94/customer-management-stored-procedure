package org.example.storedprocedure.service;


import org.example.storedprocedure.model.Customer;
import org.example.storedprocedure.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements org.example.storedprocedure.service.ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public boolean saveWithStoredProcedure(Customer customer) {
        return iCustomerRepository.saveWithStoredProcedure(customer);
    }
}
