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


    @GetMapping("/{name}")
    public Workshop findByNameWorkshop(@PathVariable String name){
        return this.workshopService.findByNameWorkshop(name);
    }

    @PostMapping            // The trainer and the Workshop Center must Exist already   
        public void addWorkshop(@RequestBody Workshop workshop){
        this.workshopService.addWorkshop(workshop);
    }



    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id)
    {
        this.workshopService.deleteWorkshop(id);
    }


}
