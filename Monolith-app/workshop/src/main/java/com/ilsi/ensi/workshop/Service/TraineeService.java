package com.ilsi.ensi.workshop.Service;

import com.ilsi.ensi.workshop.Entity.Trainee;
import com.ilsi.ensi.workshop.Repository.TraineeRepository;

import java.util.Optional;

public class TraineeService {
    private final TraineeRepository traineeRepository;

    public TraineeService(TraineeRepository traineeRepository) {
        this.traineeRepository = traineeRepository;
    }

    public void addTrainee(Trainee trainee)
    {
        traineeRepository.save(trainee);
    }

    public void deleteTrainee(Long id)
    {
        traineeRepository.deleteById(id);
    }

    public Trainee findByIdCard(Long id)
    {
        Optional<Trainee> tranee=  traineeRepository.findById(id);
        return tranee.get();
    }

}
