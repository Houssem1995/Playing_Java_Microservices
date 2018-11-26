package com.uworkshop.service;


import com.uworkshop.entity.Workshop_Center;
import com.uworkshop.repository.Workshop_CenterRepository;
import dto.Workshop_CenterDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Workshop_CenterService {
    private final Workshop_CenterRepository workshop_CenterRepository;

    public Workshop_CenterService(Workshop_CenterRepository workshop_CenterRepository) {
        this.workshop_CenterRepository = workshop_CenterRepository;
    }

    public Workshop_CenterDto addWorkshopCenter(Workshop_CenterDto workshop)
    {
        return mapToDto(workshop_CenterRepository.save(new Workshop_Center(workshop.getNameCenter(),workshop.getContact())));
    }

    public void deleteWorkshopCenter(Long id)
    {
        workshop_CenterRepository.deleteById(id);
    }

    public Optional<Workshop_Center> findByNameCenter(String name)
    {
        Optional<Workshop_Center> Center=  workshop_CenterRepository.findByNameCenter(name);
        return Center;
    }





    private static Workshop_CenterDto mapToDto (Workshop_Center workshop_center) {

        if (workshop_center != null){

            return new Workshop_CenterDto(workshop_center.getNameCenter(),workshop_center.getContact());
        }
        return null ;
    }

}
