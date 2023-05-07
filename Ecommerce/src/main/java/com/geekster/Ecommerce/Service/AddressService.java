package com.geekster.Ecommerce.Service;

import com.geekster.Ecommerce.Model.Address;
import com.geekster.Ecommerce.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    public String saveAddress(Address address){
        addressRepo.save(address);
        return "Saved address";
    }
}
