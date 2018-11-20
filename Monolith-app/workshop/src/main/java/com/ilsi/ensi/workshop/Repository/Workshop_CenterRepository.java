package com.ilsi.ensi.workshop.Repository;

import com.ilsi.ensi.workshop.Entity.Workshop_Center;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface Workshop_CenterRepository extends JpaRepository<Workshop_Center,Long> {
    Optional<Workshop_Center> findByNameCenter(String name);
}
