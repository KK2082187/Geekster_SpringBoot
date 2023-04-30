package com.geekster.Job.Service;

import com.geekster.Job.Model.JobModel;
import com.geekster.Job.Model.JobType;
import com.geekster.Job.Repository.IJobRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class JobService {
    @Autowired
    IJobRepository iJobRepository;
    public List<JobModel> getJobByType(JobType jobType){
        return iJobRepository.findBy();
    }
    public String addAll(List<JobModel>jobModelList){
        Iterable<JobModel>list = iJobRepository.saveAll(jobModelList);
        if(list != null){
            return "Added successfully!!!";
        }else{
            return "Failed !!!";
        }
    }
    public List<JobModel>getAllCompanyName(Double salary){
        return iJobRepository.getAllCompanyName(salary);
    }
    @Transactional
    public void updateEmployeeById(String employeeName,Long id){
        iJobRepository.updateEmployeeById(employeeName,id);
    }
    @Transactional
    public void deleteCompanyName(String companyName){
        iJobRepository.deleteCompanyName(companyName);
    }
}
