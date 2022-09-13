package com.example.onlinetutorapp;

import java.util.Timer;

public class Tutor {
    String cvlink,name,gender,institute,semester,studyarea,currentresult,nidnumber,mobilenumber,email,password,address;
    public Tutor(String cvlink, String name, String gender, String institute, String semester, String studyarea, String currentresult, String nidnumber, String mobilenumber, String email, String password, String address) {
    this.cvlink = cvlink;
    this.name = name;
    this.gender = gender;
    this.institute = institute;
    this.semester = semester;
    this.studyarea = studyarea;
    this.currentresult = currentresult;
    this.nidnumber = nidnumber;
    this.mobilenumber = mobilenumber;
    this.email = email;
    this.password = password;
    this.address = address;
    }

    public String getCvlink() {
        return cvlink;
    }

    public void setCvlink(String cvlink) {
        this.cvlink = cvlink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getStudyarea() {
        return studyarea;
    }

    public void setStudyarea(String studyarea) {
        this.studyarea = studyarea;
    }

    public String getCurrentresult() {
        return currentresult;
    }

    public void setCurrentresult(String currentresult) {
        this.currentresult = currentresult;
    }

    public String getNidnumber() {
        return nidnumber;
    }

    public void setNidnumber(String nidnumber) {
        this.nidnumber = nidnumber;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
