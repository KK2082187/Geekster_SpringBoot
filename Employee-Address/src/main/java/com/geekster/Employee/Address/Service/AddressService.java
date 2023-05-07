package com.geekster.Employee.Address.Service;

import com.geekster.Employee.Address.Model.Address;
import com.geekster.Employee.Address.Model.Employee;
import com.geekster.Employee.Address.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    public Address save(Address address) {
        return addressRepo.save(address);
    }

    public List<Address> getAll() {
        return addressRepo.findAll();
    }

    public List<Address> getId(Long id) {
        return addressRepo.findAllById();
    }

    public void update(Long id){
        Address event = addressRepo.findById(id);

        addressRepo.save(event);
    }
    public void delete(Long id){
        addressRepo.delete(id);
    }
}
