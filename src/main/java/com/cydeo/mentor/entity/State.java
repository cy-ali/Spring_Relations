package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "state")
public class State extends BaseEntity{

    private String stateCode;
    private String stateName;
}
