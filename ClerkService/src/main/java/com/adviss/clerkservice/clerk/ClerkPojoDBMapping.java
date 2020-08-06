package com.adviss.clerkservice.clerk;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="clerkDetails")
public class ClerkPojoDBMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="clerkName")
    private String clerkName;

    @Column(name="clerkAddress")
    private String clerkAddress;

    @Column(name="clerkContact")
    private long clerkContact;

    @Column(name="clerkAadharNo")
    private long clerkAadharNo;

    @Column(name="DOB")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date clerkBirthdate;

    @Column(name="clerkEmailId")
    private String clerkEmailId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClerkName() {
        return clerkName;
    }

    public void setClerkName(String clerkName) {
        this.clerkName = clerkName;
    }

    public String getClerkAddress() {
        return clerkAddress;
    }

    public void setClerkAddress(String clerkAddress) {
        this.clerkAddress = clerkAddress;
    }

    public long getClerkContact() {
        return clerkContact;
    }

    public void setClerkContact(long clerkContact) {
        this.clerkContact = clerkContact;
    }

    public long getClerkAadharNo() {
        return clerkAadharNo;
    }

    public void setClerkAadharNo(long clerkAadharNo) {
        this.clerkAadharNo = clerkAadharNo;
    }

    public Date getClerkBirthdate() {
        return clerkBirthdate;
    }

    public void setClerkBirthdate(Date clerkBirthdate) {
        this.clerkBirthdate = clerkBirthdate;
    }

    public String getClerkEmailId() {
        return clerkEmailId;
    }

    public void setClerkEmailId(String clerkEmailId) {
        this.clerkEmailId = clerkEmailId;
    }

    public ClerkPojoDBMapping(){

    }

    public ClerkPojoDBMapping(int id, String clerkName, String clerkAddress, long clerkContact, long clerkAadharNo, Date clerkBirthdate, String clerkEmailId) {
        this.id = id;
        this.clerkName = clerkName;
        this.clerkAddress = clerkAddress;
        this.clerkContact = clerkContact;
        this.clerkAadharNo = clerkAadharNo;
        this.clerkBirthdate = clerkBirthdate;
        this.clerkEmailId = clerkEmailId;
    }

    @Override
    public String toString() {
        return "ClerkDetails{" +
                "id=" + id +
                ", clerkName='" + clerkName + '\'' +
                ", clerkAddress='" + clerkAddress + '\'' +
                ", clerkContact=" + clerkContact +
                ", clerkAadharNo=" + clerkAadharNo +
                ", clerkBirthdate=" + clerkBirthdate +
                ", clerkEmailId='" + clerkEmailId + '\'' +
                '}';
    }
}
