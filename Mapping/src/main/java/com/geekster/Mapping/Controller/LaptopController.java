package com.geekster.Mapping.Controller;

import com.geekster.Mapping.Model.Laptop;
import com.geekster.Mapping.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;

   @GetMapping(value = "laptop")
    public void getLaptop(@RequestBody Laptop laptop){
       laptopService.getSLaptop(laptop);
   }
}
