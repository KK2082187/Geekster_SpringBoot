package com.geekster.EmployeeManagement.Controller;

import com.geekster.EmployeeManagement.Model.Address;
import com.geekster.EmployeeManagement.Service.AddressService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping(value="address")
    public String addAddress(@RequestBody List<Address> address){
        return addressService.addAddress(address);
    }
    @GetMapping(value="address")
    public List<Address>getAddress(@Nullable @RequestParam Long addressId){
        return addressService.getAddress(addressId);
    }
    @DeleteMapping(value = "/{addressId}")
    public String deleteAddress(@PathVariable Long addressId){
        return addressService.deleteAddress(addressId);
    }
    @PutMapping(value = "/{addressId}")
    public String updateAddress(@PathVariable Long addressId,@RequestBody Address address){
        return addressService.updateAddress(addressId,address);
    }
}
