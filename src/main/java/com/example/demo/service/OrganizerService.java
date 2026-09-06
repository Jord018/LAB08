package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Organizer;

public interface OrganizerService {
    Integer getOrganizerSize();
    List<Organizer> getOrganizers(Integer pageSize, Integer pageNumber);
    Organizer getOrganizer(Long id);
}
