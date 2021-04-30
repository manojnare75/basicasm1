package com.manojnare.basicasm.entity;

import javax.persistence.*;

@Entity
@Table(name="users")
public class users {
    @Id
    @Column(name="uid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uid;

    @Column(name="uname")
    private String uname;

    @Column(name="phone")
    private Long phone;

    @Column(name="gender")
    private String gender;

    @Column(name="city")
    private String city;


    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
