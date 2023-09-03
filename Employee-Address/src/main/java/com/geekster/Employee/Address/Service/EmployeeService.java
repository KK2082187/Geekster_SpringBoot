package com.geekster.Employee.Address.Service;

import com.geekster.Employee.Address.Model.Address;
import com.geekster.Employee.Address.Model.Employee;
import com.geekster.Employee.Address.Repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    public Employee create(Employee emp){
        Address add = emp.getAddress();
        add.setEmployee(emp);
        emp = employeeRepo.save(emp);
        return emp;
    }
}
