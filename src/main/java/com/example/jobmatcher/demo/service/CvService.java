package com.example.jobmatcher.demo.service;

import com.example.jobmatcher.demo.dto.CvDto;
import com.example.jobmatcher.demo.models.Cv;

import java.util.List;

public interface CvService {

    List<CvDto> getCvs();

    void postCv(Cv cv);
}
