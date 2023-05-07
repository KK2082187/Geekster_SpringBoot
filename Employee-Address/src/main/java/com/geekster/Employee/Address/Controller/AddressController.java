package com.geekster.Employee.Address.Controller;

import com.geekster.Employee.Address.Model.Address;
import com.geekster.Employee.Address.Model.Employee;
import com.geekster.Employee.Address.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping(value = "/address")
    public Address saveAll(@RequestBody Address address){
        return addressService.save(address);
    }
    @GetMapping(value="/address")
    public List<Address> getAll(){
        return addressService.getAll();
    }
    @GetMapping(value = "/address/{id}")
    public List<Address> getById(Long id){
        return addressService.getId(id);
    }
    @PutMapping(value = "/address/{id}")
    public void update(Long id){
        addressService.update(id);
    }
    @DeleteMapping(value = "/address/{id}")
    public void delete(Long id){
        addressService.delete(id);
    }
}
