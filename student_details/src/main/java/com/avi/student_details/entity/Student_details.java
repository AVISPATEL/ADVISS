package com.avi.student_details.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="student_details")
public class Student_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="student_name")
    private String student_name;

    @Column(name="address")
    private String address;

    @Column(name="student_contact")
    private long student_contact;

    @Column(name="student_aadhar_no")
    private long student_aadhar_no;

    @Column(name="d_O_b")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date birthday;

    @Column(name="enrollment_no")
    private String enrollment_no;

    @Column(name="student_email_id")
    private String student_email_id;

    public Student_details(){
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getStudent_contact() {
        return student_contact;
    }

    public void setStudent_contact(long student_contact) {
        this.student_contact = student_contact;
    }

    public long getStudent_aadhar_no() {
        return student_aadhar_no;
    }

    public void setStudent_aadhar_no(long student_aadhar_no) {
        this.student_aadhar_no = student_aadhar_no;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEnrollment_no() {
        return enrollment_no;
    }

    public void setEnrollment_no(String enrollment_no) {
        this.enrollment_no = enrollment_no;
    }

    public String getStudent_email_id() {
        return student_email_id;
    }

    public void setStudent_email_id(String student_email_id) {
        this.student_email_id = student_email_id;
    }

    public Student_details(int id, String student_name, String address, long student_contact, long student_aadhar_no, Date birthday, String enrollment_no, String student_email_id) {
        this.id = id;
        this.student_name = student_name;
        this.address = address;
        this.student_contact = student_contact;
        this.student_aadhar_no = student_aadhar_no;
        this.birthday = birthday;
        this.enrollment_no = enrollment_no;
        this.student_email_id = student_email_id;
    }

    @Override
    public String toString() {
        return "Student_details{" +
                "id=" + id +
                ", student_name='" + student_name + '\'' +
                ", address='" + address + '\'' +
                ", student_contact=" + student_contact +
                ", student_aadhar_no=" + student_aadhar_no +
                ", birthday=" + birthday +
                ", enrollment_no='" + enrollment_no + '\'' +
                ", student_email_id='" + student_email_id + '\'' +
                '}';
    }
}
