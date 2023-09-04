package com.geekster.EmployeeManagement.Controller;

import com.geekster.EmployeeManagement.Model.Address;
import com.geekster.EmployeeManagement.Model.Employee;
import com.geekster.EmployeeManagement.Service.EmployeeService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "employee")
    public String addEmployee(@RequestBody List<Employee> employee){
        return employeeService.addEmployee(employee);
    }
    @GetMapping(value = "employee")
    public List<Address> getEmployee(@Nullable @RequestParam Long employeeId){
        return employeeService.getEmployee(employeeId);
    }
    @DeleteMapping(value="/employee/{employeeId}")
    public String deleteEmployee(@PathVariable Long employeeId){
        return employeeService.deleteEmployee(employeeId);
    }
    @PutMapping(value="/employee/{employeeId}")
    public String updateEmployee(@PathVariable Long employeeId,@RequestBody Employee employee){
        return employeeService.updateEmployee(employeeId,employee);
    }
}
