package com.geekster.Mapping.Service;

import com.geekster.Mapping.Model.Address;
import com.geekster.Mapping.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addedAddress(Address address) {
        addressRepo.save(address);
        return "Added address";
    }

}
