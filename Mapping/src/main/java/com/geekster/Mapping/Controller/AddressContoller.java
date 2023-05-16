package com.geekster.Mapping.Controller;

import com.geekster.Mapping.Model.Address;
import com.geekster.Mapping.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressContoller {
    @Autowired
    AddressService addressService;
    @PostMapping(value = "addAddress")
    public String addAddress(@RequestBody Address address){
        return addressService.addedAddress(address);
    }
}
