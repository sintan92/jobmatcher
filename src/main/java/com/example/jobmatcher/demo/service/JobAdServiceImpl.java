package com.example.jobmatcher.demo.service;

import com.example.jobmatcher.demo.models.JobAd;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdServiceImpl implements JobAdService{
    @Override
    public List<JobAd> getJobAds() {
        return null;
    }

    @Override
    public void postJobAd(JobAd jobAd) {

    }
}
