package com.adviss.SignUp.bean;



import java.util.Date;


public class ClerkBean {
    private String clerkName;
    private String clerkAddress;
    private long clerkContact;
    private long clerkAadharNo;
    private Date clerkBirthdate;
    private String clerkEmailId;

    public ClerkBean(){

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


    public ClerkBean(String clerkName, String clerkAddress, long clerkContact, long clerkAadharNo, Date clerkBirthdate, String clerkEmailId) {
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
                ", clerkName='" + clerkName + '\'' +
                ", clerkAddress='" + clerkAddress + '\'' +
                ", clerkContact=" + clerkContact +
                ", clerkAadharNo=" + clerkAadharNo +
                ", clerkBirthdate=" + clerkBirthdate +
                ", clerkEmailId='" + clerkEmailId + '\'' +
                '}';
    }
}
