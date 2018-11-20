package com.ilsi.ensi.workshop.RestController;


import com.ilsi.ensi.workshop.Entity.Workshop_Center;
import com.ilsi.ensi.workshop.Service.Workshop_CenterService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/worshopCenters")
public class Workshop_centerController {


    private Workshop_CenterService workshop_CenterService;

    public Workshop_centerController(Workshop_CenterService workshop_centerService) {
        workshop_CenterService = workshop_centerService;
    }


    @GetMapping
    public Workshop_Center findByNameCenter(@RequestBody String name){
        return this.workshop_CenterService.findByNameCenter(name);
    }

    @PostMapping
    public void addWorkshopCenter(@RequestBody Workshop_Center workshop_center){
        this.workshop_CenterService.addWorkshopCenter(workshop_center);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id)
    {
        this.workshop_CenterService.deleteWorkshopCenter(id);
    }


}
