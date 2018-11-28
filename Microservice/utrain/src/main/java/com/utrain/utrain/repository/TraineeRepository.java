package com.utrain.utrain.repository;


import com.utrain.utrain.entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "trainee", path = "trainee")
public interface TraineeRepository extends JpaRepository<Trainee,Long> {

}