package com.nikos.backboneevents.service;

import com.nikos.backboneevents.front.ApiResponse;
import com.nikos.backboneevents.model.Event;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Override
    public ApiResponse<List<Event>> read() {
        return null;
    }

    @Override
    public ApiResponse<Event> readById() {
        return null;
    }

    @Override
    public ApiResponse<Event> create() {
        return null;
    }

    @Override
    public ApiResponse<Boolean> delete() {
        return null;
    }
}
