package com.uworkshop.service;


import com.uworkshop.entity.Workshop;
import com.uworkshop.entity.Workshop_Center;
import com.uworkshop.repository.WorkshopRepository;
import dto.TraineeDto;
import dto.TrainerDto;
import dto.WorkshopDto;
import dto.Workshop_CenterDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;


//@RequiredArgsConstructor
//@Slf4j
@Service
public class WorkshopService {
    private final WorkshopRepository workshopRepository;

    @Autowired
    private final RestTemplate restTemplate = new RestTemplate();

    public WorkshopService(WorkshopRepository workshopRepository, RestTemplate restTemplate) {
        this.workshopRepository = workshopRepository;
       // this.restTemplate=restTemplate;
    }



    public WorkshopDto addWorkshop(WorkshopDto workshop)
    {


        ResponseEntity<TrainerDto> trainerDtoResponseEntity
                = this.restTemplate.getForEntity(
                "http://order-service/trainer/{id}",
               TrainerDto.class,
                2
              //  workshop.getTrainerID()
        );


    return  mapToDto(this.workshopRepository.save(
            new Workshop(
                    workshop.getTitle(),
                    workshop.getDescription(),
                    workshop.getField(),
                    new Workshop_Center(workshop.getWorkshop_Center().getNameCenter(),workshop.getWorkshop_Center().getContact()),
                    trainerDtoResponseEntity.getBody().getIdCardTrainer())
    ));
//        return mapToDto(workshopRepository.save(
//                    new Workshop(workshop.getTitle(),
//                            workshop.getDescription(),
//                            workshop.getField(),
//                            new Workshop_Center(workshop.getWorkshop_Center().getNameCenter(),workshop.getWorkshop_Center().getContact()),
//
//                            workshop.getTrainer())));


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
