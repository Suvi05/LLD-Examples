package com.scaler.schemadesigning.models;

import javax.persistence.Entity;

@Entity
public class Exam extends BaseModel {
    private String name;
    private int duration;
}
