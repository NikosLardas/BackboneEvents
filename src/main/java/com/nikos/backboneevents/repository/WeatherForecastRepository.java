package com.nikos.backboneevents.repository;

import com.nikos.backboneevents.model.WeatherForecast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WeatherForecastRepository extends JpaRepository<WeatherForecast, Long> {

}