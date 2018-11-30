package com.uworkshop.restcontroller;



import com.uworkshop.entity.Workshop;
import com.uworkshop.service.WorkshopService;
import dto.WorkshopDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/Workshop")
@RestController
public class WorkshopController {


    private WorkshopService workshopService;

    public WorkshopController(WorkshopService workshopService) {
        this.workshopService = workshopService;
    }

    @GetMapping("/{id}")
    public WorkshopDto findByNameWorkshop(@PathVariable Long id){
        return this.workshopService.findById(id);
    }

  /*  @GetMapping("/{name}")
    public Optional<Workshop> findByNameWorkshop(@PathVariable String name){
        return this.workshopService.findByNameWorkshop(name);
    }*/



    @PostMapping            // The trainer and the Workshop Center must Exist already
        public void addWorkshop(@RequestBody WorkshopDto workshop){
        this.workshopService.addWorkshop(workshop);
    }



    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id)
    {
        this.workshopService.deleteWorkshop(id);
    }


}
