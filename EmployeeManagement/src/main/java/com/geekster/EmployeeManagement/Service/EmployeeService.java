package com.geekster.EmployeeManagement.Service;

import com.geekster.EmployeeManagement.Model.Address;
import com.geekster.EmployeeManagement.Model.Employee;
import com.geekster.EmployeeManagement.Repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo iEmployeeRepo;
    public String addEmployee(List<Employee> employee) {
        List<Employee> List = iEmployeeRepo.saveAll(employee);

        if(List==null){
            return "Not added successfully";
        }

        return "Added successfully";
    }

    public String deleteEmployee(Long employeeId) {
        List<Employee> list = iEmployeeRepo.findById(employeeId);

        if(list.isEmpty()){
            return "Employee with employeeId "+ employeeId + " not found";
        }else{
            iEmployeeRepo.deleteById(employeeId);
            return "Employee with employeeId "+ employeeId + " deleted successfully";
        }
    }

    public String updateEmployee(Long employeeId, Employee employee) {
        List<Employee> list = iEmployeeRepo.findById(employeeId);
        employee.setEmployeeId(employeeId);

        if(list.isEmpty()){
            return "Employee with employeeId "+ employeeId + " not found";
        }else{
            employeeRepo.save(employee);
            return "Employee with employeeId "+ employeeId + " updated successfully";
        }
    }
    }

    public List<Address> getEmployee(Long employeeId) {
        if(employeeId == null){
            return iEmployeeRepo.findAll();
        }else{
            List<Employee> employeeList = new ArrayList<>();
            List<Employee> list = iEmployeeRepo.findById(employeeId);
            if(list.isEmpty()){
                throw new IllegalStateException("employeeId not found");
            }
            employeeList.add(iEmployeeRepo.findById(employeeId).get());
            return employeeList;

        }
    }
}
