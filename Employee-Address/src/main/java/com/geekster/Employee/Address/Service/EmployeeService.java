package com.geekster.Employee.Address.Service;

import com.geekster.Employee.Address.Model.Employee;
import com.geekster.Employee.Address.Repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    public Employee save(Employee employee) {
         return employeeRepo.save(employee);
    }

    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

    public List<Employee> getId(Long id) {
        return employeeRepo.findAllById();
    }

    public void update(Long id){
        Employee event = employeeRepo.findById(id);

        employeeRepo.save(event);
    }
    public void delete(Long id){
        employeeRepo.delete(id);
    }


}
