package com.jasty.domain;

/**
 * Created by cppc on 2018-02-03.
 */
import javax.persistence.*;
import java.util.Date;

@Entity
public class Customer {

    // "customer_seq" is Oracle sequence name.
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
    Long id;

    String name;

    String email;

    @Column(name = "CREATED_DATE")
    Date date;

    //getters and setters, contructors


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getDate() {
        return date;
    }
}
