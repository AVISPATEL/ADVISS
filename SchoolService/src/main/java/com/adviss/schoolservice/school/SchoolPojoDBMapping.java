package com.adviss.schoolservice.school;

import javax.persistence.*;

@Entity
@Table(name="schoolDetails")
public class SchoolPojoDBMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="schoolName")
    private String schoolName;

    @Column(name="schoolAddress")
    private String address;

    @Column(name="schoolCode")
    private int schoolCode;

    @Column(name="schoolContact")
    private long schoolContact;

    @Column(name="principalName")
    private String principalName;

    @Column(name="principalContact")
    private long principalContact;

    @Column(name="principalAadharNo")
    private long aadharNo;

    @Column(name="userName")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="schoolEmailId")
    private String schoolEmailId;

    public SchoolPojoDBMapping(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(int schoolCode) {
        this.schoolCode = schoolCode;
    }

    public long getSchoolContact() {
        return schoolContact;
    }

    public void setSchoolContact(long schoolContact) {
        this.schoolContact = schoolContact;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public long getPrincipalContact() {
        return principalContact;
    }

    public void setPrincipalContact(long principalContact) {
        this.principalContact = principalContact;
    }

    public long getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(long aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSchoolEmailId() {
        return schoolEmailId;
    }

    public void setSchoolEmailId(String schoolEmailId) {
        this.schoolEmailId = schoolEmailId;
    }

    public SchoolPojoDBMapping(int id, String schoolName, String address, int schoolCode, long schoolContact, String principalName, long principalContact, long aadharNo, String username, String password, String schoolEmailId) {
        this.id=id;
        this.schoolName = schoolName;
        this.address = address;
        this.schoolCode = schoolCode;
        this.schoolContact = schoolContact;
        this.principalName = principalName;
        this.principalContact = principalContact;
        this.aadharNo = aadharNo;
        this.username = username;
        this.password = password;
        this.schoolEmailId = schoolEmailId;
    }

    @Override
    public String toString() {
        return "SchoolDetails{" +
                "schoolName='" + schoolName + '\'' +
                ", address='" + address + '\'' +
                ", schoolCode=" + schoolCode +
                ", schoolContact=" + schoolContact +
                ", principalName='" + principalName + '\'' +
                ", principalContact=" + principalContact +
                ", aadharNo=" + aadharNo +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", emailId='" + schoolEmailId + '\'' +
                '}';
    }
}
