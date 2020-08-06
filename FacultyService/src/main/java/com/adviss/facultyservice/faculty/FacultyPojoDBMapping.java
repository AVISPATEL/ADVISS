package com.adviss.facultyservice.faculty;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="facultyDetails")
public class FacultyPojoDBMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="facultyName")
    private String facultyName;

    @Column(name="facultyAddress")
    private String facultyAddress;

    @Column(name="facultyContact")
    private long facultyContact;

    @Column(name="facultyAadharNo")
    private long facultyAadharNo;

    @Column(name="dOB")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date facultyBirthdate;

    @Column(name="facultyEmailId")
    private String facultyEmailId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    public FacultyPojoDBMapping(){

    }

    public FacultyPojoDBMapping(int id, String facultyName, String facultyAddress, long facultyContact, long facultyAadharNo, Date facultyBirthdate, String facultyEmailId) {
        this.id = id;
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
                "id=" + id +
                ", facultyName='" + facultyName + '\'' +
                ", facultyAddress='" + facultyAddress + '\'' +
                ", facultyContact=" + facultyContact +
                ", facultyAadharNo=" + facultyAadharNo +
                ", facultyBirthdate=" + facultyBirthdate +
                ", facultyEmailId='" + facultyEmailId + '\'' +
                '}';
    }
}
