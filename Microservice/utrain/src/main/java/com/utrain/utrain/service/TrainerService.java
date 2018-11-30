package com.utrain.utrain.service;


import com.utrain.utrain.entity.Trainer;
import com.utrain.utrain.repository.TrainerRepository;
import dto.TrainerDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrainerService {
    private final TrainerRepository trainerRepository;

    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public TrainerDto addTrainer(TrainerDto trainer)
    {
       return mapToDto(this.trainerRepository.save(
                                        new Trainer(
                                                trainer.getIdCardTrainer(),
                                        trainer.getFirstName(),
                                        trainer.getLastName(),
                                        trainer.getEmail(),
                                        trainer.getSpecialty())));
    }

    public void deleteTrainer(Long id)
    {
        trainerRepository.deleteById(id);
    }

    public TrainerDto findByIdCard(Long id)
    {
       return this.trainerRepository.findById(id).map(TrainerService::mapToDto).orElse(null);
    }
    public List <TrainerDto> findall(){
        System.out.println("Request to get all Trainer");
        return this.trainerRepository.findAll().stream().map(TrainerService::mapToDto).collect(Collectors.toList());
    }

    private static  TrainerDto mapToDto(Trainer trainer) {

        if (trainer != null){

            return new TrainerDto(trainer.getIdCardTrainer(),trainer.getFirstName(),trainer.getLastName(),trainer.getEmail(),trainer.getSpecialty());
        }
        return null ;
    }

}
