package com.ureservation.service;


import com.ureservation.entity.Reservation;
import com.ureservation.repository.ReservationRepository;
import dto.ReservationDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }
    public ReservationDto addReservation(ReservationDto reservation)
    {
        return mapToDto(reservationRepository.save(new Reservation(reservation.getTraineeID(),reservation.getWhorkshopID(),reservation.getReservationDate())));
    }

    public void deleteReservation(Long id)
    {
        reservationRepository.deleteById(id);
    }

    public Optional<Reservation> findById(Long id)
    {
        Optional<Reservation> reservation =  reservationRepository.findById(id);
        return reservation;
    }
    public List<Reservation> findAll()
    {
        List<Reservation> reservation =  reservationRepository.findAll();
        return reservation;

    }
    public static ReservationDto mapToDto (Reservation reservation){

        if (reservation !=null){

            return new ReservationDto(reservation.getTraineeID(),reservation.getWhorkshopID(),reservation.getReservationDate());
        }

        return null;
    }

}
