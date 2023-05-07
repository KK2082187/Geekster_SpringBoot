package com.geekster.Employee.Address.Controller;

import com.geekster.Employee.Address.Model.Employee;
import com.geekster.Employee.Address.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping(value = "/employee")
    public Employee saveAll(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
    @GetMapping(value="/employAll")
    public List<Employee>getAll(){
        return employeeService.getAll();
    }
    @GetMapping(value = "/employee/{id}")
    public List<Employee> getById(Long id){
        return employeeService.getId(id);
    }
    @PutMapping(value = "/employee/{id}")
    public void update(Long id){
         employeeService.updateById(id);
    }
    @DeleteMapping(value = "/employee/{id}")
    public void delete(Long id){
        employeeService.delete(id);
    }
}

