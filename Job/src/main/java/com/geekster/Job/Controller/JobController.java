package com.geekster.Job.Controller;

import com.geekster.Job.Model.JobModel;
import com.geekster.Job.Model.JobType;
import com.geekster.Job.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/job")
public class JobController {
    @Autowired
    JobService jobService;
    @GetMapping(value = "/type/{jobType}")
    public List<JobModel> getJobBasedOnType(@PathVariable JobType jobType){
        return jobService.getJobByType(jobType);
    }
    @GetMapping(value="/employ/{salary}")
    public List<JobModel>getAllEmployeeSalary(@PathVariable Double salary){
        return jobService.getAllEmployeeSalary(salary);
    }
    @PostMapping(value="/added")
    public String addedJob(@RequestBody List<JobModel>jobModelList){
        return jobService.addAll(jobModelList);
    }
    @PutMapping(value = "/employeeName/{employeeName}/ID/{id}")
    public void insertJob(@PathVariable String employeeName, @PathVariable Long id)
    {
        jobService.updateEmployeeById(employeeName,id);
    }
    @DeleteMapping(value = "/companyName/{companyName}")
    public void deleteCompanyName(@PathVariable  String companyName)
    {
        jobService.deleteCompanyName(companyName);
    }
}
