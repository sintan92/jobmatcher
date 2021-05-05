package com.example.jobmatcher.demo.service;

import com.example.jobmatcher.demo.models.JobAd;

import java.util.List;

public interface JobAdService {

    List<JobAd> getJobAds();

    void postJobAd(JobAd jobAd);
}
