package com.ureservation.service;


import com.ureservation.entity.Reservation;
import com.ureservation.repository.ReservationRepository;
import dto.ReservationDto;
import dto.TraineeDto;
import dto.TrainerDto;
import dto.WorkshopDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
        RestTemplate restTemplate1 = new RestTemplate();
        ResponseEntity<TraineeDto> traineeDtoResponseEntity
                = restTemplate1.getForEntity(
                "http://localhost:8088/trainee/{id}",
                TraineeDto.class,
                reservation.getTraineeID());
        RestTemplate restTemplate2 = new RestTemplate();
        ResponseEntity<WorkshopDto> workshopDtoResponseEntity
                = restTemplate1.getForEntity(
                "http://localhost:8087/Workshop/{id}",
                WorkshopDto.class,
                reservation.getWhorkshopID());

        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");
        System.out.println(traineeDtoResponseEntity);
        System.out.println(workshopDtoResponseEntity);
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");


        return mapToDto(reservationRepository.save(new Reservation(traineeDtoResponseEntity.getBody().getIdCard(),workshopDtoResponseEntity.getBody().getId(),reservation.getReservationDate())));
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
