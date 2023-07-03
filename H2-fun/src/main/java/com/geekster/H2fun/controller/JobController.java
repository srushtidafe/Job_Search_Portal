package com.geekster.H2fun.controller;

import com.geekster.H2fun.models.Job;
import com.geekster.H2fun.models.JobType;
import com.geekster.H2fun.services.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class JobController {

    @Autowired
    JobService jobService;
    @GetMapping(value = "/Job")
    public Iterable<Job> getAllJob(){
        return jobService.getAllJob();
    }
    @GetMapping(value = "/Job/{title}")
    public List<Job> findByTitle(@PathVariable String title){
        return jobService.findByTitle(title);
    }
    @GetMapping(value = "/Job/SalaryGreaterThan/{salary}")
    public List<Job> findBySalaryGreaterThan(@PathVariable Double salary){
        return jobService.findBySalaryGreaterThan(salary);
    }
    @GetMapping(value = "/Job/employerName/{employerName}salary/{salary}")
    public List<Job> getEmployeeBySalary( @PathVariable String employerName ,@PathVariable Double salary){
        return jobService.getEmployeeBySalary(employerName ,salary);
    }
    @GetMapping(value = "/Job/salary/{salary}")
    public void getJobOrderBySalary(@PathVariable Double salary){
         jobService.getJobOrderBySalary(salary);
    }
    @PostMapping(value ="/Jobs")
    public void addAllJob(@Valid @RequestBody List<Job> jobList){ jobService.addAllJob(jobList);
    }
    @PostMapping(value ="/Job")
    public void addJob(@Valid @RequestBody Job job){ jobService.addJob(job);
    }
    @PutMapping(value = "Job/JobType/{jobType}/JobId/{id}")
    public void updateJobTypeById(@Valid @PathVariable JobType jobType ,@PathVariable Integer id){
        jobService.updateJobTypeById(jobType, id);
    }
    @DeleteMapping (value = "/Job/JobId/{id}")
    public void deleteById(@PathVariable Integer id){
         jobService.deleteById(id);
    }

}
