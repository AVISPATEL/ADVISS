package com.adviss.SignIn.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class StudentBean {

    private String studentName;
    private String studentAddress;
    private long studentContact;
    private long studentAadharNo;
    private Date birthday;
    private String enrollmentNo;
    private String studentEmailId;

    public StudentBean(){

    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return studentAddress;
    }

    public void setAddress(String studentAddress) {
        this.studentAddress = studentAddress;
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

    public StudentBean( String studentName, String studentAddress, long studentContact, long studentAadharNo, Date birthday, String enrollmentNo, String studentEmailId) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentContact = studentContact;
        this.studentAadharNo = studentAadharNo;
        this.birthday = birthday;
        this.enrollmentNo = enrollmentNo;
        this.studentEmailId = studentEmailId;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                ", studentName='" + studentName + '\'' +
                ", address='" + studentAddress + '\'' +
                ", studentContact=" + studentContact +
                ", studentAadharNo=" + studentAadharNo +
                ", birthday=" + birthday +
                ", enrollmentNo='" + enrollmentNo + '\'' +
                ", studentEmailId='" + studentEmailId + '\'' +
                '}';
    }
}
