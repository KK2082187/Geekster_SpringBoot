package com.geekster.Employee.Address.Repository;

import com.geekster.Employee.Address.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee,Long> {

}
