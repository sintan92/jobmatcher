package com.example.jobmatcher.demo.controller;

import com.example.jobmatcher.demo.dto.CvDto;
import com.example.jobmatcher.demo.models.Cv;
import com.example.jobmatcher.demo.repository.CvRepository;
import com.example.jobmatcher.demo.repository.JobAdRepository;
import com.example.jobmatcher.demo.service.CvService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(tags = "CvApi", description = "API för cv till mig")
@Controller
@RestController
@RequestMapping(path = "/api")
public class CvController {

    @Autowired
    private CvRepository cvRepository;
    private CvService cvService;
    private JobAdRepository jobAdRepository;


    @GetMapping("/CvList")
    @ApiOperation(value = "Hämta Cv", notes = "Returnerar lista på Cv",
            response = Cv.class)
    public ResponseEntity getCv()  {
        System.out.println("anropades innan GET genomförs");
        List<CvDto> results = cvService.getCvs();
        System.out.println("anropades från controller");
        return new ResponseEntity(results, HttpStatus.OK);
    }

    @PostMapping("/postCv")
    @ApiOperation(value = "posta Cv", notes = " postar Cv",
            response = Cv.class)
       public void postCv(@RequestBody Cv Cv){
            cvService.postCv(Cv);
    }

}
