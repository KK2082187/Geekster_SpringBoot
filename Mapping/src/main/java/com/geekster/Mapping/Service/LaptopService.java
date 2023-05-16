package com.geekster.Mapping.Service;

import com.geekster.Mapping.Model.Laptop;
import com.geekster.Mapping.Repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo iLaptopRepo;

    public void getSLaptop(Laptop laptop) {
        iLaptopRepo.findAll();
    }
}
