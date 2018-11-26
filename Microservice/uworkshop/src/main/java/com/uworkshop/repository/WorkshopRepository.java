package com.uworkshop.repository;


import com.uworkshop.entity.Workshop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface WorkshopRepository extends JpaRepository<Workshop,Long> {
    Optional<Workshop> findByTitle(String name);
}