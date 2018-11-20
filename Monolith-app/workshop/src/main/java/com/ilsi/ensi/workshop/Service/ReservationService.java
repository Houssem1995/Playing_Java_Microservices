package com.ilsi.ensi.workshop.Service;

import com.ilsi.ensi.workshop.Entity.Reservation;
import com.ilsi.ensi.workshop.Repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }
    public void addReservation(Reservation reservation)
    {
        reservationRepository.save(reservation);
    }

    public void deleteReservation(Long id)
    {
        reservationRepository.deleteById(id);
    }

    public Reservation findById(Long id)
    {
        Optional<Reservation> reservation =  reservationRepository.findById(id);
        return reservation.get();
    }
    public List<Reservation> findAll()
    {
        List<Reservation> reservation =  reservationRepository.findAll();
        return reservation;
    }
}
