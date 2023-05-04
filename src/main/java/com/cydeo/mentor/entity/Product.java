package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "product")
public class Product extends BaseEntity {

    private String name;
    private double price;

    @ManyToOne
    private Category category;

}
