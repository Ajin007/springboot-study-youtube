package com.springbootproject.springbootyoutube.job;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Specidific end points for the jobs:
 * GET /jobs: Get the jobs
 * GET /jobs/{id}: Get the specific job bu ID
 * GET /jobs/{id}/company :Get the specific company associated with the ID
 * POST /jobs ----> post the values in the array
 * DELETE /jobs/{ID}: Delete the jobs by the ID
 */

@RestController
public class JobController {

    //This is created sinece we are not have not connected any thing to the datatbase so only
    private List<Job> jobs=new ArrayList<>();

    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobs;
    }




}
