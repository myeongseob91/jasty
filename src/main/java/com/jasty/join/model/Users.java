package com.jasty.join.model;

import javax.persistence.*;

//entity 어노테이션을 써야 jpa에서 users 클래스를 사용할 수 있음
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERS_SEQ")
    @SequenceGenerator(sequenceName = "users_seq", allocationSize = 1, name = "USERS_SEQ")
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String firstname;
    private String name;
    private String birth;
    private String pwd;
    private String phonenum;
    private String email;

    public String getFirstname() { return firstname; }

    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPwd() { return pwd; }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Users{" +
                ", firstname='" + firstname + '\'' +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", pwd='" + pwd + '\'' +
                ", phonenum='" + phonenum + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}


