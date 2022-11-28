package com.nikos.backboneevents.service;


import com.nikos.backboneevents.front.ApiResponse;
import com.nikos.backboneevents.model.Event;

import java.util.List;

public interface EventService {

    ApiResponse<List<Event>> read();

    ApiResponse<Event> readById();

    ApiResponse<Event> create();

    ApiResponse<Boolean> delete();
}