package com.example.jobmatcher.demo.repository;

import com.example.jobmatcher.demo.models.JobAd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobAdRepository extends CrudRepository<JobAd, Long> {
}
