package com.ilsi.ensi.workshop.Service;

import com.ilsi.ensi.workshop.Entity.Workshop;
import com.ilsi.ensi.workshop.Repository.WorkshopRepository;

import java.util.Optional;

public class WorkshopService {
    private final WorkshopRepository workshopRepository;

    public WorkshopService(WorkshopRepository workshopRepository) {
        this.workshopRepository = workshopRepository;
    }
    public void addWorkshop(Workshop workshop)
    {
        workshopRepository.save(workshop);
    }
    public void deleteWorkshop(Long id)
    {
        workshopRepository.deleteById(id);
    }
    public Workshop findByNameWorkshop(String name)
    {
        Optional<Workshop> workshop=  workshopRepository.findByTitle(name);
        return workshop.get();
    }

}
