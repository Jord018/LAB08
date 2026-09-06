package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Organizer;

import jakarta.annotation.PostConstruct;

@Repository
public class OrganizerDaoImpl implements OrganizerDao {
    List<Organizer> organizerList;

    @PostConstruct
    public void init() {
        organizerList = new ArrayList<>();
        organizerList.add(Organizer.builder()
                .id(1L)
                .organizationName("Kat Laydee Foundation")
                .address("123 Meow Street, Meow Town")
                .build());
        organizerList.add(Organizer.builder()
                .id(2L)
                .organizationName("Flora City Gardeners")
                .address("456 Bloom Ave, Flora City")
                .build());
        organizerList.add(Organizer.builder()
                .id(3L)
                .organizationName("Playa Clean Initiative")
                .address("789 Shore Rd, Playa Del Carmen")
                .build());
    }

    @Override
    public Integer getOrganizerSize() {
        return organizerList.size();
    }

    @Override
    public List<Organizer> getOrganizers(Integer pageSize, Integer page) {
        pageSize = pageSize == null ? organizerList.size() : pageSize;
        page = page == null ? 1 : page;
        int firstIndex = (page - 1) * pageSize;
        return organizerList.subList(firstIndex, Math.min(firstIndex + pageSize, organizerList.size()));
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerList.stream().filter(organizer -> organizer.getId().equals(id)).findFirst().orElse(null);
    }
}
