package com.example.jobmatcher.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JobAd {

    @Id
    @GeneratedValue
    private Long id;
    private String heading;
    private String description;
    private String qualifications;

    public JobAd() {
    }

    public JobAd(Long id, String heading, String description, String qualifications) {
        this.id = id;
        this.heading = heading;
        this.description = description;
        this.qualifications = qualifications;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
}
