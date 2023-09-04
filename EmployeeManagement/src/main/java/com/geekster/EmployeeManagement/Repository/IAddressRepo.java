package com.geekster.EmployeeManagement.Repository;

import com.geekster.EmployeeManagement.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Long> {
}
