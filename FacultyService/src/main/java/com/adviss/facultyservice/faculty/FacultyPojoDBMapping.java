package com.adviss.facultyservice.faculty;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="faculty_details")
public class FacultyPojoDBMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="faculty_name")
    private String faculty_name;

    @Column(name="faculty_address")
    private String faculty_address;

    @Column(name="faculty_contact")
    private long faculty_contact;

    @Column(name="faculty_aadhar_no")
    private long faculty_aadhar_no;

    @Column(name="d_O_b")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date faculty_birthdate;

    @Column(name="faculty_email_id")
    private String faculty_email_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }

    public String getFaculty_address() {
        return faculty_address;
    }

    public void setFaculty_address(String faculty_address) {
        this.faculty_address = faculty_address;
    }

    public long getFaculty_contact() {
        return faculty_contact;
    }

    public void setFaculty_contact(long faculty_contact) {
        this.faculty_contact = faculty_contact;
    }

    public long getFaculty_aadhar_no() {
        return faculty_aadhar_no;
    }

    public void setFaculty_aadhar_no(long faculty_aadhar_no) {
        this.faculty_aadhar_no = faculty_aadhar_no;
    }

    public Date getFaculty_birthdate() {
        return faculty_birthdate;
    }

    public void setFaculty_birthdate(Date faculty_birthdate) {
        this.faculty_birthdate = faculty_birthdate;
    }

    public String getFaculty_email_id() {
        return faculty_email_id;
    }

    public void setFaculty_email_id(String faculty_email_id) {
        this.faculty_email_id = faculty_email_id;
    }
    public FacultyPojoDBMapping(){

    }

    public FacultyPojoDBMapping(int id, String faculty_name, String faculty_address, long faculty_contact, long faculty_aadhar_no, Date faculty_birthdate, String faculty_email_id) {
        this.id = id;
        this.faculty_name = faculty_name;
        this.faculty_address = faculty_address;
        this.faculty_contact = faculty_contact;
        this.faculty_aadhar_no = faculty_aadhar_no;
        this.faculty_birthdate = faculty_birthdate;
        this.faculty_email_id = faculty_email_id;
    }

    @Override
    public String toString() {
        return "Faculty_details{" +
                "id=" + id +
                ", faculty_name='" + faculty_name + '\'' +
                ", faculty_address='" + faculty_address + '\'' +
                ", faculty_contact=" + faculty_contact +
                ", faculty_aadhar_no=" + faculty_aadhar_no +
                ", faculty_birthdate=" + faculty_birthdate +
                ", faculty_email_id='" + faculty_email_id + '\'' +
                '}';
    }
}
