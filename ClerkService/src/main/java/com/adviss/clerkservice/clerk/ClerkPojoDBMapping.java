package com.adviss.clerkservice.clerk;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="clerk_details")
public class ClerkPojoDBMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="clerk_name")
    private String clerk_name;

    @Column(name="clerk_address")
    private String clerk_address;

    @Column(name="clerk_contact")
    private long clerk_contact;

    @Column(name="clerk_aadhar_no")
    private long clerk_aadhar_no;

    @Column(name="d_O_b")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date clerk_birthdate;

    @Column(name="clerk_email_id")
    private String clerk_email_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClerk_name() {
        return clerk_name;
    }

    public void setClerk_name(String clerk_name) {
        this.clerk_name = clerk_name;
    }

    public String getClerk_address() {
        return clerk_address;
    }

    public void setClerk_address(String clerk_address) {
        this.clerk_address = clerk_address;
    }

    public long getClerk_contact() {
        return clerk_contact;
    }

    public void setClerk_contact(long clerk_contact) {
        this.clerk_contact = clerk_contact;
    }

    public long getClerk_aadhar_no() {
        return clerk_aadhar_no;
    }

    public void setClerk_aadhar_no(long clerk_aadhar_no) {
        this.clerk_aadhar_no = clerk_aadhar_no;
    }

    public Date getClerk_birthdate() {
        return clerk_birthdate;
    }

    public void setClerk_birthdate(Date clerk_birthdate) {
        this.clerk_birthdate = clerk_birthdate;
    }

    public String getClerk_email_id() {
        return clerk_email_id;
    }

    public void setClerk_email_id(String clerk_email_id) {
        this.clerk_email_id = clerk_email_id;
    }

    public ClerkPojoDBMapping(){

    }

    public ClerkPojoDBMapping(int id, String clerk_name, String clerk_address, long clerk_contact, long clerk_aadhar_no, Date clerk_birthdate, String clerk_email_id) {
        this.id = id;
        this.clerk_name = clerk_name;
        this.clerk_address = clerk_address;
        this.clerk_contact = clerk_contact;
        this.clerk_aadhar_no = clerk_aadhar_no;
        this.clerk_birthdate = clerk_birthdate;
        this.clerk_email_id = clerk_email_id;
    }

    @Override
    public String toString() {
        return "Clerk_details{" +
                "id=" + id +
                ", clerk_name='" + clerk_name + '\'' +
                ", clerk_address='" + clerk_address + '\'' +
                ", clerk_contact=" + clerk_contact +
                ", clerk_aadhar_no=" + clerk_aadhar_no +
                ", clerk_birthdate=" + clerk_birthdate +
                ", clerk_email_id='" + clerk_email_id + '\'' +
                '}';
    }
}
