package com.ilsi.ensi.workshop.Service;

import com.ilsi.ensi.workshop.Entity.Trainer;
import com.ilsi.ensi.workshop.Repository.TrainerRepository;

import java.util.Optional;

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

    public Trainer findByIdCard(Long id)
    {
        Optional<Trainer> traner=  trainerRepository.findById(id);
        return traner.get();
    }



}
