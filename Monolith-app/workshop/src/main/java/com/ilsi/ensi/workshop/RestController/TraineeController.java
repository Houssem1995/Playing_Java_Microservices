package com.ilsi.ensi.workshop.RestController;

import com.ilsi.ensi.workshop.Entity.Trainee;
import com.ilsi.ensi.workshop.Service.TraineeService;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/trainee")
public class TraineeController {


    private final TraineeService traineeService;

    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    @GetMapping
    public Trainee findByName(@RequestBody Long id){
        return this.traineeService.findByIdCard(id);
    }

    @PostMapping
    public void addTrainer(@RequestBody Trainee trainer){
        this.traineeService.addTrainee(trainer);
    }

    @DeleteMapping(path="/id")
    public void delete (@PathVariable Long id)
    {
        this.traineeService.deleteTrainee(id);
    }


}
