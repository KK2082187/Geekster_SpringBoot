package com.geekster.Job.Repository;

import com.geekster.Job.Model.JobModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface IJobRepository extends CrudRepository<JobModel,Integer> {

    List<JobModel> findBy();
    @Query(value="select*from JOB_MODEL where salary > :20000",nativeQuery=true)
    public List<JobModel>getAllEmployeeSalary(Double salary);

    @Modifying
    @Query(value = "update JOB_MODEL set EMPLOYEE_NAME = :salary where ID = :id" , nativeQuery = true)
    public void updateEmployeeById(String employeeName, Long id);

    @Modifying
    @Query(value = "Delete from JOB_MODEL where EMPLOYEE_NAME <= :salary" , nativeQuery = true)
    public void deleteCompanyName(String  companyName);
}
