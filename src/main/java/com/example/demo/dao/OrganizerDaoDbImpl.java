package com.example.demo.dao;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Organizer;
import com.example.demo.repository.OrganizerRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
@Profile("db")
@Primary
public class OrganizerDaoDbImpl implements OrganizerDao {
    final OrganizerRepository organizerRepository;

    @Override
    public Integer getOrganizerSize() {
        return Math.toIntExact(organizerRepository.count());
    }

    @Override
    public List<Organizer> getOrganizers(Integer pageSize, Integer page) {
        pageSize = pageSize == null ? (int) organizerRepository.count() : pageSize;
        page = page == null ? 1 : page;
        return organizerRepository.findAll(PageRequest.of(page - 1, pageSize)).getContent();
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerRepository.findById(id).orElse(null);
    }

    @Override
    public Organizer save(Organizer organizer) {
        return organizerRepository.save(organizer);
    }
}
