package com.UST.userservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="user_tab")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String firstname;
    private  String lastname;
    private  String email;
    private  Long departmentId;

//    public Long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Long getDepartmentid() {
//        return departmentid;
//    }
//
//    public void setDepartmentid(Long departmentid) {
//        this.departmentid = departmentid;
//    }
//    public User(Long userId, String firstname, String lastname, String email, Long departmentid) {
//        this.userId = userId;
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.email = email;
//        this.departmentid = departmentid;
//    }
//
//    public User() {
//    }
//
//
//


}
