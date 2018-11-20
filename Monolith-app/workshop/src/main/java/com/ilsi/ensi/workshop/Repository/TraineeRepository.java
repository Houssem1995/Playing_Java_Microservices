package com.ilsi.ensi.workshop.Repository;

import com.ilsi.ensi.workshop.Entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee,Long> {

}