package com.adviss.SignIn.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class FacultyBean {

    private String facultyName;
    private String facultyAddress;
    private long facultyContact;
    private long facultyAadharNo;
    private Date facultyBirthdate;
    private String facultyEmailId;


    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyAddress() {
        return facultyAddress;
    }

    public void setFacultyAddress(String facultyAddress) {
        this.facultyAddress = facultyAddress;
    }

    public long getFacultyContact() {
        return facultyContact;
    }

    public void setFacultyContact(long facultyContact) {
        this.facultyContact = facultyContact;
    }

    public long getFacultyAadharNo() {
        return facultyAadharNo;
    }

    public void setFacultyAadharNo(long facultyAadharNo) {
        this.facultyAadharNo = facultyAadharNo;
    }

    public Date getFacultyBirthdate() {
        return facultyBirthdate;
    }

    public void setFacultyBirthdate(Date facultyBirthdate) {
        this.facultyBirthdate = facultyBirthdate;
    }

    public String getFacultyEmailId() {
        return facultyEmailId;
    }

    public void setFacultyEmailId(String facultyEmailId) {
        this.facultyEmailId = facultyEmailId;
    }
    public FacultyBean(){

    }

    public FacultyBean( String facultyName, String facultyAddress, long facultyContact, long facultyAadharNo, Date facultyBirthdate, String facultyEmailId) {
        this.facultyName = facultyName;
        this.facultyAddress = facultyAddress;
        this.facultyContact = facultyContact;
        this.facultyAadharNo = facultyAadharNo;
        this.facultyBirthdate = facultyBirthdate;
        this.facultyEmailId = facultyEmailId;
    }

    @Override
    public String toString() {
        return "FacultyDetails{" +
                ", facultyName='" + facultyName + '\'' +
                ", facultyAddress='" + facultyAddress + '\'' +
                ", facultyContact=" + facultyContact +
                ", facultyAadharNo=" + facultyAadharNo +
                ", facultyBirthdate=" + facultyBirthdate +
                ", facultyEmailId='" + facultyEmailId + '\'' +
                '}';
    }
}
