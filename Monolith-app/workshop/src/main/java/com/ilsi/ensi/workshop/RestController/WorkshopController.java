package com.ilsi.ensi.workshop.RestController;


import com.ilsi.ensi.workshop.Entity.Workshop;
import com.ilsi.ensi.workshop.Service.WorkshopService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/Workshop")
@RestController
public class WorkshopController {


    private WorkshopService workshopService;

    public WorkshopController(WorkshopService workshopService) {
        this.workshopService = workshopService;
    }


    @GetMapping
    public Workshop findByNameWorkshop(@RequestBody String name){
        return this.workshopService.findByNameWorkshop(name);
    }

    @PostMapping
    public void addTrainer(@RequestBody Workshop workshop){
        this.workshopService.addWorkshop(workshop);
    }

    @DeleteMapping(path="/id")
    public void delete (@PathVariable Long id)
    {
        this.workshopService.deleteWorkshop(id);
    }


}
