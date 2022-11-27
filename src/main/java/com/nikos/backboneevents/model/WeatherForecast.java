package com.nikos.backboneevents.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class WeatherForecast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Define through API
}
