package com.example.jobmatcher.demo.repository;

import com.example.jobmatcher.demo.models.Cv;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CvRepository extends CrudRepository<Cv, Long> {
}
