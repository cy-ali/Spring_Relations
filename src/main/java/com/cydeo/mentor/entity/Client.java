package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "client")
public class Client extends BaseEntity {

    private String clientName;
    private String phone;
    private String email;

    @ManyToOne
    private Address address;

}
