package com.uworkshop.service;


import com.uworkshop.entity.Workshop_Center;
import com.uworkshop.repository.Workshop_CenterRepository;
import dto.Workshop_CenterDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public List<Workshop_CenterDto> findall(){
        System.out.println("Request to get all Trainer");
        return this.workshop_CenterRepository.findAll().stream().map(Workshop_CenterService::mapToDto).collect(Collectors.toList());
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


            Workshop_CenterDto workshop_CenterDto       =   new Workshop_CenterDto(workshop_center.getNameCenter(),workshop_center.getContact());

            workshop_CenterDto.setIdCenter(workshop_center.getIdCenter());
            return workshop_CenterDto;

        }
        return null ;
    }


}
