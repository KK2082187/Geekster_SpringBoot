package com.geekster.EmployeeManagement.Service;

import com.geekster.EmployeeManagement.Model.Address;
import com.geekster.EmployeeManagement.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;
    public String addAddress(List<Address> address) {
        List<Address>addressList = iAddressRepo.saveAll(address);
        if(addressList==null){
            return  "Not added";
        }
        return "Added";
    }

    public List<Address> getAddress(Long addressId) {
        if(addressId==null){
            return iAddressRepo.findAll();
        }else{
            List<Address>addressList = new ArrayList<>();
            addressList.add(iAddressRepo.findById(addressId).get());
            return addressList;
        }
    }

    public String deleteAddress(Long addressId) {
        List<Address> list = iAddressRepo.findById(addressId);

        if(list.isEmpty()){
            return "Address with addressId "+ addressId + " not found";
        }else{
            iAddressRepo.deleteById(addressId);
            return "Address with addressId "+ addressId + " deleted successfully";
        }
    }

    public String updateAddress(Long addressId, Address address) {
        List<Address> list = iAddressRepo.findById(addressId);
        address.setAddressId(addressId);

        if(list.isEmpty()){
            return "Address with addressId "+ addressId + " not found";
        }else{
            iAddressRepo.save(address);
            return "Address with addressId "+ addressId + " updated successfully";
        }
    }
}
