package com.utrain.utrain.restcontroller;


import com.utrain.utrain.service.TrainerService;
import dto.TrainerDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController


@RequestMapping("/trainer")
public class TrainerController {
    private  final TrainerService trainerService;



    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping
    public List<TrainerDto> findAll(){
        return this.trainerService.findall();
    }


    @GetMapping("{id}")
    public TrainerDto findByName(@PathVariable Long id){
        return this.trainerService.findByIdCard(id);
    }



    @PostMapping
    public void addTrainer(@RequestBody TrainerDto trainer){
        this.trainerService.addTrainer(trainer);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id)
    {
        this.trainerService.deleteTrainer(id);
    }


}
