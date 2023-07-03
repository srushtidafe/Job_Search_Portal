package com.geekster.H2fun.services;

import com.geekster.H2fun.models.Job;
import com.geekster.H2fun.models.JobType;
import com.geekster.H2fun.repository.IJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    IJobRepository jobRepository;

    public Iterable<Job> getAllJob() {
        return jobRepository.findAll();
    }

    public void addJob(Job job) {
        jobRepository.save(job);
    }
    public List<Job> findByTitle(String title) {
        return jobRepository.findByTitle(title);
    }

    public List<Job> findBySalaryGreaterThan(Double salary) {
        return jobRepository.findBySalaryGreaterThan(salary);
    }

    public List<Job> getEmployeeBySalary(String employerName, Double salary) {
          return jobRepository.findByEmployerNameAndSalaryGreaterThan(employerName , salary);
    }

    public void addAllJob(List<Job> jobList) {
        jobRepository.saveAll(jobList);
    }

    public void deleteById(Integer id) {
         jobRepository.deleteById(id);
    }

    public void updateJobTypeById(JobType jobType, Integer id) {
        jobRepository.updateJobTypeById(jobType,id);
    }

    public void getJobOrderBySalary(Double salary) {
        jobRepository.findByJobOrderBySalary(salary);
    }
}
