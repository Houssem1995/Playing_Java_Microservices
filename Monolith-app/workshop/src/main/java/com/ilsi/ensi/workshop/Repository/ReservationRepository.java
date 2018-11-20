package com.ilsi.ensi.workshop.Repository;

import com.ilsi.ensi.workshop.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {


}

