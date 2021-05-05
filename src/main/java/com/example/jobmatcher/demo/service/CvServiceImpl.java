package com.example.jobmatcher.demo.service;

import com.example.jobmatcher.demo.dto.CvDto;
import com.example.jobmatcher.demo.models.Cv;
import com.example.jobmatcher.demo.repository.CvRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class CvServiceImpl implements CvService{


    private final ModelMapper modelMapper;
    private final CvRepository cvRepository;

    @Autowired
    public CvServiceImpl(ModelMapper modelMapper, CvRepository cvRepository) {
        this.modelMapper = modelMapper;
        this.cvRepository = cvRepository;
    }

    @Override
    public List<CvDto> getCvs() {
        List<Cv> cvList = (List<Cv>) cvRepository.findAll();
        List<CvDto> cvDtoList= new ArrayList<>();
        for (Cv cv: cvList){
            CvDto dto = modelMapper.map(cv, CvDto.class);
            cvDtoList.add(dto);
        }
        System.out.println("anropades från service");

        return cvDtoList;
    }

    @Override
    public void postCv(Cv cv) {

    }
}
