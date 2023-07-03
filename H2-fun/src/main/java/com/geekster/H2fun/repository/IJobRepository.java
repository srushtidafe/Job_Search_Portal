package com.geekster.H2fun.repository;

import com.geekster.H2fun.models.Job;
import com.geekster.H2fun.models.JobType;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
public interface IJobRepository extends CrudRepository<Job, Integer> {
    //    Custom Finder method
    public List<Job> findBySalaryGreaterThan(Double salary);

    public List<Job> findByTitle(String title);

    public List<Job> findByEmployerNameAndSalaryGreaterThan(String employerName, Double salary);

//    Custom Query method
    @Transactional
    @Modifying
    @Query(value = "select * from job order by salary" , nativeQuery = true)
    public void findByJobOrderBySalary(Double salary);

//    Custom Query method
    @Transactional
    @Modifying
    @Query(value ="update Job set JOB_TYPE =:jobType where JOB_ID=:id",nativeQuery = true)
    public void updateJobTypeById(JobType jobType, Integer id);
}