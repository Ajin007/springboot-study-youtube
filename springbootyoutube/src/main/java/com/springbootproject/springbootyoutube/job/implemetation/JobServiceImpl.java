package com.springbootproject.springbootyoutube.job.implemetation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootproject.springbootyoutube.job.Job;
import com.springbootproject.springbootyoutube.job.JobService;

@Service
public class JobServiceImpl implements  JobService {

private List<Job> jobs= new ArrayList<>();

    @Override
    public List<Job> findAll() {
      return jobs;
    }

    @Override
    public void createJob(Job job) {
        jobs.add(job);
    }

    @Override
    public Job getJobById(Long id) {

      for (Job job : jobs) {
        if (job.getId().equals(id)) return job;
      }
      return null;
      
      

        
      
  
    }
    }


