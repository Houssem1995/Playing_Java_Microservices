package com.utrain.utrain.repository;


import com.utrain.utrain.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrainerRepository extends JpaRepository<Trainer,Long> {

}
