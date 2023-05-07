package com.geekster.Employee.Address.Repository;

import com.geekster.Employee.Address.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Integer> {
    Address findById(Long id);

    List<Address> findAllById();

    void delete(Long id);
}
