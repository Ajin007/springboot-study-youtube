package com.springbootproject.springbootyoutube.job;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*
 * Specidific end points for the jobs:
 * GET /jobs: Get the jobs
 * GET /jobs/{id}: Get the specific job bu ID
 * GET /jobs/{id}/company :Get the specific company associated with the ID
 * POST /jobs ----> post the values in the array
 * DELETE /jobs/{ID}: Delete the jobs by the ID
 * PUT /jobs/{id} ----> updated job by ID(request body should have the updated job)
 */

@RestController
public class JobController {

    //This is created sinece we are not have not connected any thing to the datatbase so only
    private JobService jobService;

    private Long user_id=0L;


    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobService.findAll();
    }

    //constructor
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping("/jobs")
    //this response body is needed to pass on the values
    public String addJob(@RequestBody Job job){

        // to understand how this works use postman  and send a json object 
        //shall use jsoninit like to make perfect json format data
        // This is the link https://jsonlint.com/ to validate the Json format

        //This line is added to  ensure ID is uniquely updated
        job.setId(user_id++);
        jobService.createJob(job);
        return "Current job added successfully";
    }

    @GetMapping("/jobs/{id}")
    public Job getJobById(@PathVariable Long id){

       Job job= jobService.getJobById(id);
        return job;

    }




}
