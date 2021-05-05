package com.example.jobmatcher.demo.models;

public class ExceptionHandler {

    private String Message;
    private org.springframework.http.HttpStatus HttpStatus;
    private String Heading;

    public ExceptionHandler(String heading, String message, org.springframework.http.HttpStatus httpStatus){
        Message = message;
        HttpStatus = httpStatus;
        Heading = heading;
    }

    public String getHeading(){
        return Heading;
    }
    public String getExceptionMessage(){
        return HttpStatus.name();
    }
    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public int getStatus() {
        return HttpStatus.value();
    }

    public void setHttpStatus(org.springframework.http.HttpStatus httpStatus) {
        HttpStatus = httpStatus;
    }
}
