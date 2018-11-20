package com.ilsi.ensi.workshop.RestController;


import com.ilsi.ensi.workshop.Dto.TrainerDto;
import com.ilsi.ensi.workshop.Entity.Trainer;
import com.ilsi.ensi.workshop.Service.TrainerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerController {
    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping
    public List<TrainerDto> findAll(){
        return this.trainerService.findall();
    }


    @GetMapping("{id}")
    public TrainerDto findByName(@RequestBody Long id){
        return this.trainerService.findByIdCard(id);
    }



    @PostMapping
    public void addTrainer(@RequestBody Trainer trainer){
        this.trainerService.addTrainer(trainer);
    }

    @DeleteMapping("{/id}")
    public void delete (@PathVariable Long id)
    {
        this.trainerService.deleteTrainer(id);
    }


}
