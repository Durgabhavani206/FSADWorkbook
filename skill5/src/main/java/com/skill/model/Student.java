package com.skill.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id;
    private String name;
    private String gender;

    @Autowired
    private Certification certification;   // Field Injection

    public Student() {
        this.id = 32351;
        this.name = "Bhavani";
        this.gender = "Female";
    }

    public void display() {
        System.out.println("Student Details:");
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Gender : " + gender);

        System.out.println("Certification Details:");
        System.out.println("Certificate ID   : " + certification.getId());
        System.out.println("Certificate Name : " + certification.getName());
        System.out.println("Completed : " + certification.getDateOfCompletion());
    }
}
