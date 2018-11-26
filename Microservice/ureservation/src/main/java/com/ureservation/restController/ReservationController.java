package com.ureservation.restController;
import com.ureservation.entity.Reservation;
import com.ureservation.service.ReservationService;
import dto.ReservationDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Reservation")
public class ReservationController {
    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    public void addReservation(@RequestBody ReservationDto reservation){
        this.reservationService.addReservation(reservation);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id)
    {
        this.reservationService.deleteReservation(id);
    }

    @GetMapping
    public List<Reservation> findAll(){
        return this.reservationService.findAll();
    }


}