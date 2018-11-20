package com.ilsi.ensi.workshop.Service;

import com.ilsi.ensi.workshop.Dto.TrainerDto;
import com.ilsi.ensi.workshop.Entity.Trainer;
import com.ilsi.ensi.workshop.Repository.TrainerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrainerService {
    private final TrainerRepository trainerRepository;

    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public void addTrainer(Trainer trainer)
    {
        trainerRepository.save(trainer);
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

            return new TrainerDto(trainer.getFirstName(),trainer.getLastName(),trainer.getEmail(),trainer.getSpecialty());
        }
        return null ;
    }


}
