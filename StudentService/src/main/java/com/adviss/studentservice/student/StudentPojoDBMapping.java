package com.adviss.studentservice.student;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="studentDetails")
public class StudentPojoDBMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="studentName")
    private String studentName;

    @Column(name="address")
    private String address;

    @Column(name="studentContact")
    private long studentContact;

    @Column(name="studentAadharNo")
    private long studentAadharNo;

    @Column(name="dOB")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date birthday;

    @Column(name="enrollmentNo")
    private String enrollmentNo;

    @Column(name="studentEmailId")
    private String studentEmailId;

    public StudentPojoDBMapping(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(long studentContact) {
        this.studentContact = studentContact;
    }

    public long getStudentAadharNo() {
        return studentAadharNo;
    }

    public void setStudentAadharNo(long studentAadharNo) {
        this.studentAadharNo = studentAadharNo;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(String enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }

    public String getStudentEmailId() {
        return studentEmailId;
    }

    public void setStudentEmailId(String studentEmailId) {
        this.studentEmailId = studentEmailId;
    }

    public StudentPojoDBMapping(int id, String studentName, String address, long studentContact, long studentAadharNo, Date birthday, String enrollmentNo, String studentEmailId) {
        this.id = id;
        this.studentName = studentName;
        this.address = address;
        this.studentContact = studentContact;
        this.studentAadharNo = studentAadharNo;
        this.birthday = birthday;
        this.enrollmentNo = enrollmentNo;
        this.studentEmailId = studentEmailId;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", address='" + address + '\'' +
                ", studentContact=" + studentContact +
                ", studentAadharNo=" + studentAadharNo +
                ", birthday=" + birthday +
                ", enrollmentNo='" + enrollmentNo + '\'' +
                ", studentEmailId='" + studentEmailId + '\'' +
                '}';
    }
}
