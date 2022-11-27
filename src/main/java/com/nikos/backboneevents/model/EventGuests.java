package com.nikos.backboneevents.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class EventGuests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    private Event event;

    @ManyToOne
    private Person person;
}
