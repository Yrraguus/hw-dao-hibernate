package com.example.hwdaohibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PERSONS")
public class Person {
    @EmbeddedId
    private PersonPrimaryKey personPrimaryKey;

    @Column
    private String phoneNumber;

    @Column
    private String cityOfLiving;

}
