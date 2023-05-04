package com.cydeo.mentor.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "address")
public class Address extends BaseEntity{


    private String description;
    private String zipCode;

    @ManyToOne
    private State state;

}
