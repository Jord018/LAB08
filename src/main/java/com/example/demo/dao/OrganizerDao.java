package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Organizer;

public interface OrganizerDao {
    Integer getOrganizerSize();
    List<Organizer> getOrganizers(Integer pageSize, Integer pageNumber);
    Organizer getOrganizer(Long id);
}
