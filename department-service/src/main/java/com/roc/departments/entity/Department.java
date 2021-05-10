package com.roc.departments.entity;

import javax.persistence.Entity;

@Entity
public class Department {

    @javax.persistence.Id(Genera)
    
    private Long Id;
    private String deptName;
    private String deptAddress;
    private String depTCode;

}
