package com.nikos.backboneevents.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "person")
    private List<EventGuests> guests;

}
