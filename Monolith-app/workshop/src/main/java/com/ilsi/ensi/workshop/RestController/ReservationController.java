package com.ilsi.ensi.workshop.RestController;

import com.ilsi.ensi.workshop.Entity.Reservation;
import com.ilsi.ensi.workshop.Service.ReservationService;
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
    public void addReservation(@RequestBody Reservation reservation){
        this.reservationService.addReservation(reservation);
    }

    @DeleteMapping(path="/id")
    public void delete (@PathVariable Long id)
    {
        this.reservationService.deleteReservation(id);
    }

    @GetMapping
    public List<Reservation> findAll(){
        return this.reservationService.findAll();
    }


}
