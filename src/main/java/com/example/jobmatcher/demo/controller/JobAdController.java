package com.example.jobmatcher.demo.controller;


import com.example.jobmatcher.demo.models.ExceptionHandler;
import com.example.jobmatcher.demo.models.JobAd;
import com.example.jobmatcher.demo.repository.JobAdRepository;
import com.example.jobmatcher.demo.service.JobAdService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "JobAdApi", description = "API för jobbannonser")
@RestController
@Controller
@RequestMapping(path = "/api")
public class JobAdController {


    @Autowired
    private JobAdRepository jobAdRepository;
    private JobAdService jobAdService;

    private final Logger log = LoggerFactory.getLogger(JobAd.class);



    @GetMapping("/JobAdList")
    @ApiOperation(value = "Hämta Jobbannonser", notes = "Returnerar lista på jobbannonser",
            response = JobAd.class)
    public List<JobAd> getJobAd()  {

            List<JobAd> results;
            results = jobAdService.getJobAds();
        return results;
    }

    @PostMapping("/postJobAd")
    @ApiOperation(value = "posta Jobbannonser", notes = "Postar jobbannonser",
            response = JobAd.class)
    public void postJobAd(@RequestBody JobAd JobAd){

            jobAdService.postJobAd(JobAd);

    }
}
