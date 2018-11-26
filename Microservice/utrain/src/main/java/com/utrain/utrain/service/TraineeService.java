package com.utrain.utrain.service;


import com.utrain.utrain.entity.Trainee;
import com.utrain.utrain.repository.TraineeRepository;
import dto.TraineeDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TraineeService {
    private final TraineeRepository traineeRepository;

    public TraineeService(TraineeRepository traineeRepository) {
        this.traineeRepository = traineeRepository;
    }

    public TraineeDto addTrainee(TraineeDto trainee)
    {
        return mapToDto(traineeRepository.save(new Trainee(trainee.getFirstName(),trainee.getLastName(),trainee.getEmail())));
    }

    public void deleteTrainee(Long id)
    {
        traineeRepository.deleteById(id);
    }

    public Optional<Trainee> findByIdCard(Long id)
    {
        Optional<Trainee> trainee=  traineeRepository.findById(id);
        return trainee;
    }

    private static  TraineeDto mapToDto(Trainee trainee) {

        if (trainee != null){

            return new TraineeDto(trainee.getFirstName(),trainee.getLastName(),trainee.getEmail());
        }
        return null ;
    }
}
