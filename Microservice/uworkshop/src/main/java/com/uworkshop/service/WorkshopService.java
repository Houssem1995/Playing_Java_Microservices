package com.uworkshop.service;


import com.uworkshop.entity.Workshop;
import com.uworkshop.entity.Workshop_Center;
import com.uworkshop.repository.WorkshopRepository;
import com.uworkshop.repository.Workshop_CenterRepository;
import dto.TrainerDto;
import dto.WorkshopDto;
import dto.Workshop_CenterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;
import java.util.stream.Collectors;


//@RequiredArgsConstructor
//@Slf4j
@Service
public class WorkshopService {
    private final WorkshopRepository workshopRepository;
    private final Workshop_CenterRepository workshopCenterRepository;
    @Autowired
    private  RestTemplate restTemplate = new RestTemplate();

    public WorkshopService(WorkshopRepository workshopRepository, RestTemplate restTemplate, Workshop_CenterRepository workshopCenterRepository) {
        this.workshopRepository = workshopRepository;
       // this.restTemplate=restTemplate;
        this.workshopCenterRepository = workshopCenterRepository;
    }



    public WorkshopDto addWorkshop(WorkshopDto workshop)
    {
        System.out.println("AAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");


        RestTemplate restTemplate1 = new RestTemplate();
        ResponseEntity<TrainerDto> trainerDtoResponseEntity
                = restTemplate1.getForEntity(
                "http://localhost:8088/trainer/{id}",
               TrainerDto.class,
              workshop.getTrainerID()
        );
       // System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
       // System.out.println(workshop.getWorkshop_Center().getIdCenter());


     //   Workshop_Center wk1= new Workshop_Center(workshop.getWorkshop_Center().getNameCenter(),workshop.getWorkshop_Center().getContact());
      //  wk1.setIdCenter(workshop.getWorkshop_Center().getIdCenter());

        Optional<Workshop_Center> worshop_center= workshopCenterRepository.findById(workshop.getWorkshop_Center().getIdCenter());

        System.out.println(worshop_center.get());

    return  mapToDto(this.workshopRepository.save(
            new Workshop(
                    workshop.getTitle(),
                    workshop.getDescription(),
                    workshop.getField(),
                    worshop_center.get(),
                    trainerDtoResponseEntity.getBody().getIdCardTrainer())
    ));


    }


public Workshop_Center maptoEntity (Workshop_CenterDto workshop_centerDto){

return new Workshop_Center(workshop_centerDto.getNameCenter(),workshop_centerDto.getContact());

}


    public WorkshopDto findById(Long id)
    {
        return this.workshopRepository.findById(id).map(WorkshopService::mapToDto).orElse(null);
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
            WorkshopDto WorkshopDto = new WorkshopDto(workshop.getTitle(),workshop.getDescription(),workshop.getField(), new Workshop_CenterDto(workshop.getWorkshop_Center().getNameCenter(),workshop.getWorkshop_Center().getContact()),workshop.getTrainerID());
            WorkshopDto.setId(workshop.getId());
            return  WorkshopDto;
        }
        return null ;
    }


}
