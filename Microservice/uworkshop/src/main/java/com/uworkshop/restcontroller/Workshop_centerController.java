package com.uworkshop.restcontroller;



import com.uworkshop.entity.Workshop_Center;
import com.uworkshop.service.Workshop_CenterService;
import dto.Workshop_CenterDto;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/worshopCenters")
public class Workshop_centerController {


    private Workshop_CenterService workshop_CenterService;

    public Workshop_centerController(Workshop_CenterService workshop_centerService) {
        workshop_CenterService = workshop_centerService;
    }


    @GetMapping
    public Optional<Workshop_Center> findByNameCenter(@RequestBody String name){
        return this.workshop_CenterService.findByNameCenter(name);
    }

    @PostMapping
    public void addWorkshopCenter(@RequestBody Workshop_CenterDto workshop_center){
        this.workshop_CenterService.addWorkshopCenter(workshop_center);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id)
    {
        this.workshop_CenterService.deleteWorkshopCenter(id);
    }


}
