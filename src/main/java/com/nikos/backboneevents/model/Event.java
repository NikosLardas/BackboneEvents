package com.nikos.backboneevents.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate eventDate;
    private String city;
    private String country;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<EventGuests> property;

    @OneToOne(cascade = CascadeType.ALL)
    private WeatherForecast forecast;
}
