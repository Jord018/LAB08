package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Event;

public interface EventService {
    Integer getEventSize();
    List<Event> getEvents(Integer pageSize, Integer pageNumber);
    Event getEvent(Long id);
}
