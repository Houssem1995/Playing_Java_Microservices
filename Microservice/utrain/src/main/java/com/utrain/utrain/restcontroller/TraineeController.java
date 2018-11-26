package com.utrain.utrain.restcontroller;

;
import com.utrain.utrain.entity.Trainee;
import com.utrain.utrain.service.TraineeService;
import dto.TraineeDto;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/trainee")
public class TraineeController {


    private final TraineeService traineeService;

    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    @GetMapping("{id}")
    public Optional<Trainee> findById(@PathVariable Long id){
        return this.traineeService.findByIdCard(id);
    }

    @PostMapping
    public void addTrainee(@RequestBody TraineeDto trainer){
        this.traineeService.addTrainee(trainer);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id)
    {
        this.traineeService.deleteTrainee(id);
    }


}
