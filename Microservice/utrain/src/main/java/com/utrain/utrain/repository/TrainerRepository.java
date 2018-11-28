package com.utrain.utrain.repository;


import com.utrain.utrain.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "trainer", path = "trainer")
public interface TrainerRepository extends JpaRepository<Trainer,Long> {

}
