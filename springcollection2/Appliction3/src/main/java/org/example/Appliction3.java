package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Appliction3 {

    private String subject;


    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public String toString() {
        return "Appliction3{" +
                "subject='" + subject + '\'' +
                '}';
    }
   @PostConstruct
    public void Start(){
        System.out.println(" starting method");
    }
    @PreDestroy
    public void end(){
        System.out.println("ending method");
    }
}

