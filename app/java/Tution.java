package com.example.onlinetutorapp;

public class Tution {
    String classinformation, subjectinformation, universityinformation, daysinformation, areainformation,salaryinformation;
    public Tution(String classinfo, String subjectinfo, String universityinfo, String daysinfo, String areainfo, String salaryinfo){
        classinformation = classinfo;
        subjectinformation = subjectinfo;
        universityinformation = universityinfo;
        daysinformation = daysinfo;
        areainformation = areainfo;
        salaryinformation = salaryinfo;
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
