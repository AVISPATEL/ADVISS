package com.adviss.schoolservice.school;



import javax.persistence.*;

@Entity
@Table(name="school_details")
public class SchoolPojoDBMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="school_name")
    private String school_name;

    @Column(name="school_address")
    private String address;

    @Column(name="school_code")
    private int school_code;

    @Column(name="school_contact")
    private long school_contact;

    @Column(name="principal_name")
    private String principal_name;

    @Column(name="principal_contact")
    private long principal_contact;

    @Column(name="principal_aadhar_no")
    private long aadhar_no;

    @Column(name="user_name")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="school_email_id")
    private String email_id;

    public SchoolPojoDBMapping(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSchool_code() {
        return school_code;
    }

    public void setSchool_code(int school_code) {
        this.school_code = school_code;
    }

    public long getSchool_contact() {
        return school_contact;
    }

    public void setSchool_contact(long school_contact) {
        this.school_contact = school_contact;
    }

    public String getPrincipal_name() {
        return principal_name;
    }

    public void setPrincipal_name(String principal_name) {
        this.principal_name = principal_name;
    }

    public long getPrincipal_contact() {
        return principal_contact;
    }

    public void setPrincipal_contact(long principal_contact) {
        this.principal_contact = principal_contact;
    }

    public long getAadhar_no() {
        return aadhar_no;
    }

    public void setAadhar_no(long aadhar_no) {
        this.aadhar_no = aadhar_no;
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

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public SchoolPojoDBMapping(int id, String school_name, String address, int school_code, long school_contact, String principal_name, long principal_contact, long aadhar_no, String username, String password, String email_id) {
        this.id=id;
        this.school_name = school_name;
        this.address = address;
        this.school_code = school_code;
        this.school_contact = school_contact;
        this.principal_name = principal_name;
        this.principal_contact = principal_contact;
        this.aadhar_no = aadhar_no;
        this.username = username;
        this.password = password;
        this.email_id = email_id;
    }

    @Override
    public String toString() {
        return "School_details{" +
                "school_name='" + school_name + '\'' +
                ", address='" + address + '\'' +
                ", school_code=" + school_code +
                ", school_contact=" + school_contact +
                ", principal_name='" + principal_name + '\'' +
                ", principal_contact=" + principal_contact +
                ", aadhar_no=" + aadhar_no +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email_id='" + email_id + '\'' +
                '}';
    }
}
