package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.OrganizerDao;
import com.example.demo.entity.Organizer;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrganizerServiceImpl implements OrganizerService {

    final OrganizerDao organizerDao;

    @Override
    public Integer getOrganizerSize() {
        return organizerDao.getOrganizerSize();
    }

    @Override
    public List<Organizer> getOrganizers(Integer pageSize, Integer page) {
        return organizerDao.getOrganizers(pageSize, page);
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerDao.getOrganizer(id);
    }
}
