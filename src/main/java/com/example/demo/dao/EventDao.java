package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Event;

public interface EventDao {
    Integer getEventSize();
    List<Event> getEvents(Integer pageSize, Integer pageNumber);
    Event getEvent(Long id);
}