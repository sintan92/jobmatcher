package com.example.jobmatcher.demo.Config;

import com.example.jobmatcher.demo.models.Cv;
import com.example.jobmatcher.demo.repository.CvRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    CommandLineRunner commandLineRunner(CvRepository repository) {
        return args -> {
            repository.save(new Cv(1L, "hej"));
            repository.save(new Cv(2L, "det här är ett cv som ska fixa jobb"));

        };
    }
}
