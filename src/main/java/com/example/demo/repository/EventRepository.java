package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Event;
public interface EventRepository extends CrudRepository<Event, Long> {
    List<Event> findAll();
}