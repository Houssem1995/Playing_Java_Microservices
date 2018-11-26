package com.uworkshop.service;


import com.uworkshop.entity.Workshop;
import com.uworkshop.entity.Workshop_Center;
import com.uworkshop.repository.WorkshopRepository;
import dto.WorkshopDto;
import dto.Workshop_CenterDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WorkshopService {
    private final WorkshopRepository workshopRepository;


    public WorkshopService(WorkshopRepository workshopRepository) {
        this.workshopRepository = workshopRepository;
    }
    public WorkshopDto addWorkshop(WorkshopDto workshop)
    {
        return mapToDto(workshopRepository.save(
                    new Workshop(workshop.getTitle(),
                            workshop.getDescription(),
                            workshop.getField(),
                            new Workshop_Center(workshop.getWorkshop_Center().getNameCenter(),workshop.getWorkshop_Center().getContact()),
                            workshop.getTrainer())));


    }



    public void deleteWorkshop(Long id)
    {
        workshopRepository.deleteById(id);
    }
    public Optional<Workshop> findByNameWorkshop(String name)
    {
        Optional<Workshop> workshop=  workshopRepository.findByTitle(name);
        return workshop;
    }




    public static WorkshopDto mapToDto (Workshop workshop){

        if (workshop != null)
        {
            return new WorkshopDto(workshop.getTitle(),workshop.getDescription(),workshop.getField(), new Workshop_CenterDto(workshop.getWorkshop_Center().getNameCenter(),workshop.getWorkshop_Center().getContact()),workshop.getTrainerID());
        }
        return null ;
    }
}
