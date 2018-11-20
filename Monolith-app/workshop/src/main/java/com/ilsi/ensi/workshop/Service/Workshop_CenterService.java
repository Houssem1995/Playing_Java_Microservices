package com.ilsi.ensi.workshop.Service;

import com.ilsi.ensi.workshop.Entity.Workshop_Center;
import com.ilsi.ensi.workshop.Repository.Workshop_CenterRepository;

import java.util.Optional;

public class Workshop_CenterService {
    private final Workshop_CenterRepository workshop_CenterRepository;

    public Workshop_CenterService(Workshop_CenterRepository workshop_CenterRepository) {
        this.workshop_CenterRepository = workshop_CenterRepository;
    }

    public void addWorkshopCenter(Workshop_Center workshop_center)
    {
        workshop_CenterRepository.save(workshop_center);
    }

    public void deleteWorkshopCenter(Long id)
    {
        workshop_CenterRepository.deleteById(id);
    }

    public Workshop_Center findByNameCenter(String name)
    {
        Optional<Workshop_Center> Center=  workshop_CenterRepository.findByNameCenter(name);
        return Center.get();
    }

}
