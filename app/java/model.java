package com.example.onlinetutorapp;

public class model {
    String classinformation, subjectinformation, universityinformation, daysinformation, areainformation, salaryinformation;

    public model() {
    }

    public model(String classinformation, String subjectinformation, String universityinformation, String daysinformation, String areainformation, String salaryinformation) {
        this.classinformation = classinformation;
        this.subjectinformation = subjectinformation;
        this.universityinformation = universityinformation;
        this.daysinformation = daysinformation;
        this.areainformation = areainformation;
        this.salaryinformation = salaryinformation;
    }

    public String getClassinformation() {
        return classinformation;
    }

    public void setClassinformation(String classinformation) {
        this.classinformation = classinformation;
    }

    public String getSubjectinformation() {
        return subjectinformation;
    }

    public void setSubjectinformation(String subjectinformation) {
        this.subjectinformation = subjectinformation;
    }

    public String getUniversityinformation() {
        return universityinformation;
    }

    public void setUniversityinformation(String universityinformation) {
        this.universityinformation = universityinformation;
    }

    public String getDaysinformation() {
        return daysinformation;
    }

    public void setDaysinformation(String daysinformation) {
        this.daysinformation = daysinformation;
    }

    public String getAreainformation() {
        return areainformation;
    }

    public void setAreainformation(String areainformation) {
        this.areainformation = areainformation;
    }

    public String getSalaryinformation() {
        return salaryinformation;
    }

    public void setSalaryinformation(String salaryinformation) {
        this.salaryinformation = salaryinformation;
    }
}
