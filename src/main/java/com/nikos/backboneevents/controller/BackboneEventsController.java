package com.nikos.backboneevents.controller;

import com.nikos.backboneevents.front.ApiResponse;
import com.nikos.backboneevents.model.Event;
import com.nikos.backboneevents.service.EventGuestsService;
import com.nikos.backboneevents.service.EventService;
import com.nikos.backboneevents.service.PersonService;
import com.nikos.backboneevents.service.WeatherForecastService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BackboneEventsController {

    private EventService eventService;
    private PersonService personService;
    private EventGuestsService eventGuestsService;
    private WeatherForecastService forecastService;
//
    public BackboneEventsController(EventService eventService, PersonService personService, EventGuestsService eventGuestsService, WeatherForecastService forecastService) {
        this.eventService = eventService;
        this.personService = personService;
        this.eventGuestsService = eventGuestsService;
        this.forecastService = forecastService;
    }

    @GetMapping("ping")
    public String ping() {
        return "The API is working";
    }

    @GetMapping("events")
    public ApiResponse<List<Event>> getEvents() {

        return eventService.read();
    }

    @GetMapping("event/{id}")
    public ApiResponse<Event> getEventById() {

        return eventService.readById();
    }

    @PostMapping("event")
    public ApiResponse<Event> createEvent() {

        return eventService.create();
    }

    @DeleteMapping("event/{id}")
    public ApiResponse<Boolean> deleteEvent() {

        return eventService.delete();
    }

}