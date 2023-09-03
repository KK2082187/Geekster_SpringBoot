package com.geekster.Employee.Address.Controller;

import com.geekster.Employee.Address.Model.Employee;
import com.geekster.Employee.Address.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping(value = "/empAdd")
    public Employee createEmployee(@RequestBody Employee emp){
        return employeeService.create(emp);
    }


}

